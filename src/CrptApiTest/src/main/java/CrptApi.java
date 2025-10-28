import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.text.Document;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class CrptApi {
    private static final String BASE_URL = "https://ismp.crpt.ru/api/v3";
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;
    private final ScheduledExecutorService scheduler;
    private final Semaphore semaphore;

    private final TimeUnit timeUnit;
    private final int requestLimit;

    public CrptApi(TimeUnit timeUnit, int requestLimit) {
        if (requestLimit <= 0) {
            throw new IllegalArgumentException("requestLimit должен быть положительным числом");
        }
        this.timeUnit = Objects.requireNonNull(timeUnit);
        this.requestLimit = requestLimit;
        this.httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(10)).build();
        this.objectMapper = new ObjectMapper();
        this.semaphore = new Semaphore(requestLimit, true);
        this.scheduler = Executors.newSingleThreadScheduledExecutor();

        scheduler.scheduleAtFixedRate(() -> {
            int toRelease = requestLimit - semaphore.availablePermits();
            if (toRelease > 0) {
                semaphore.release();
            }
        }, 0, 1, timeUnit);
    }

    public void createDocument(Document document, String signature) throws InterruptedException, IOException {
        Objects.requireNonNull(document, signature);

        semaphore.acquire();

        String requestBody = buildRequestBody(document, signature);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + "/documents/create"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() >= 400) {
            throw new IOException("Ошибка при создании документа: " +
                    response.statusCode() + " " + response.body());
        }
    }

    private String buildRequestBody(Document document, String signature) throws JsonProcessingException {
        Requestbody body = new Requestbody(document, signature);
        return objectMapper.writeValueAsString(body);
    }

    public void shutDown() {
        scheduler.shutdownNow();
    }

    private static class Requestbody {
        public final Document document;
        public final String signature;


        private Requestbody(Document document, String signature) {
            this.document = document;
            this.signature = signature;
        }
    }

    public static class Document {
        public Description description;
        public String doc_id;
        public String doc_status;
        public String doc_type;
        public boolean importRequest;
        public String owner_inn;
        public String participant_inn;
        public String producer_inn;
        public String production_date;
        public String production_type;
        public Product[] products;
        public String reg_date;
        public String reg_number;

        public static class Description {
            public String participantInn;
        }

        public static class Product{
            public String certificate_document;
            public String certificate_document_date;
            public String certificate_document_number;
            public String owner_inn;
            public String producer_inn;
            public String production_date;
            public String tnved_code;
            public String uit_code;
            public String uitu_code;
        }
    }



    public static void main(String[] args) throws IOException, InterruptedException {
            CrptApi api = new CrptApi(TimeUnit.SECONDS, 5);

            Document doc = new Document();
        doc.doc_id = "123";
        doc.doc_type = "LP_INTRODUCE_GOODS";
        doc.owner_inn = "1234567890";
        doc.producer_inn = "1234567890";
        doc.production_date = "2020-01-23";
        doc.production_type = "OWN_PRODUCTION";
        doc.products = new Document.Product[1];
        doc.products[0] = new Document.Product();
        doc.products[0].tnved_code = "1234567890";
        doc.products[0].uit_code = "00000000000000000000000000000000";
        doc.products[0].uitu_code = "00000000000000000000000000000000";

        api.createDocument(doc, "FAKE_SIGNATURE");

        api.shutDown();
    }
}


