import java.math.BigDecimal;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("Блок 1: Вывод характеристик компьютера");
        // частота процессора
        Float procGhz = 3.80f;
        // Количество ядер
        byte colCore = 8;
        // Количество оперативной памяти
        Short ram = 32;
        // разрядность системы
        int sysType = 64;
        // Количество памяти
        long hdd = 2200;
        // Количесвто видео - памяти
        double videoMemo = 8067.0;
        // Количество дисков
        char directoryCol = '3';
        // Операционная система
        boolean isWindows = true;
        System.out.println("частота процессора - " + procGhz);

        System.out.println("Количество ядер - " + colCore);

        System.out.println("Количество оперативной памяти - " + ram + "Гб");

        System.out.println("разрядность системы - " + sysType + "битная");

        System.out.println("Количество памяти - " + hdd + "Гб");

        System.out.println("Количество видео - памяти - " + videoMemo + "Мб");

        System.out.println("Количество дисков - " + directoryCol);

        System.out.println("Операционная система - Windows -" + isWindows);
        System.out.println();
        System.out.println("Блок 2 - Расчет стоимости товара со скидкой");

        // Стоимость ручки
        Float penCost = 105.5f;
        // Стоимоть книги
        Float bookCost = 235.83f;
        // Процент Скидки
        Float discount = 11.0f;
        // Стоимость ручки и книги без скидки
        Float finCost = penCost + bookCost;
        // Сумма скидки
        Float discountSum = finCost * (discount / 100);
        // Стоимость товаров со скидкой;
        Float discountCost = finCost - discountSum;
        System.out.println("Стоимость товаров без скидки " + finCost);
        System.out.println("Сумма скидки " + discountSum);
        System.out.println("Стоимость товаров со скидкой " + discountCost);
        System.out.println();

        System.out.println("Блок 3 - Вывод слова JAVA");

        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa");
        System.out.println("  JJ  a     a  V  a     a");
        System.out.println();

        System.out.println("Блок 4 Вывод min и max значений целых числовых типов");

        byte bmax = 127;
        System.out.println("byte Максимальное значение " + bmax);
        bmax++;
        System.out.println("byte значение после инкремента " + bmax);
        bmax--;
        System.out.println("byte значение после декремента " + bmax);
        System.out.println();
        short smax = 32767;
        System.out.println("short Максимальное значение " + smax);
        smax++;
        System.out.println("short значение после инкремента " + smax);
        smax--;
        System.out.println("short значение после декремента " + smax);
        System.out.println();
        int imax = 2147483647;
        System.out.println("int Максимальное значение " + imax);
        imax++;
        System.out.println("int знаечние после инкремента " + imax);
        imax--;
        System.out.println("int знаечние после декремента " + imax);
        System.out.println();
        long lmax = 9223372036854775807L;
        System.out.println("Long Максимальное знаечние " + lmax);
        lmax++;
        System.out.println("Long знаечние после инкремента " + lmax);
        lmax--;
        System.out.println("Long знаечние после декремента " + lmax);
        System.out.println();

        System.out.println("Блок 5 перестановка значений переменых");

        int firstVar = 5;
        int secondVar = 2;
        System.out.println("firstVar первоначальное значение = " + firstVar);
        System.out.println("secondVar первоначальное значение = " + secondVar);
        System.out.println();
        // перестановка с помощью третьей переменной
        int thirdVar = 0;
        thirdVar = firstVar;
        firstVar = secondVar;
        secondVar = thirdVar;
        System.out.println("firstVar перестановка с помощью третьей переменной = " + firstVar);
        System.out.println("secondVar перестановка с помощью третьей переменной = " + secondVar);
        System.out.println();

        // перестановка с помощью арефметических операций
        firstVar = firstVar + secondVar;
        secondVar = firstVar - secondVar;
        firstVar = firstVar - secondVar;
        System.out.println("firstVar перестановка с помощью арефметических операций = " + firstVar);
        System.out.println("secondVar перестановка с помощью арефметических операций = " + secondVar);
        System.out.println();

        // Перестановка с помощью побитовых операций
        firstVar = firstVar ^ secondVar;
        secondVar = secondVar ^ firstVar;
        firstVar = firstVar ^ secondVar;
        System.out.println("firstVar Перестановка с помощью побитовых операций = " + firstVar);
        System.out.println("secondVar Перестановка с помощью побитовых операций = " + secondVar);
        System.out.println();

        System.out.println("Блок 6 - Вывод символов и их кодов ");

        char asciiSym1 = '$';
        char asciiSym2 = '*';
        char asciiSym3 = '@';
        char asciiSym4 = '|';
        char asciiSym5 = '~';
        System.out.println("Код символа     Символ");
        System.out.println("1. 36             " + asciiSym1);
        System.out.println("2. 42             " + asciiSym2);
        System.out.println("3. 64             " + asciiSym3);
        System.out.println("4. 124            " + asciiSym4);
        System.out.println("5. 126            " + asciiSym5);
        System.out.println();

        System.out.println("Блок 7 - Вывод в консоль ASCII-арт Дюка ");

        char code92 = '\\';
        char code47 = '/';
        char code95 = '_';
        char code40 = '(';
        char code41 = ')';

        System.out.print("    " + code47);
        System.out.println(code92);
        System.out.print("   " + code47);
        System.out.println("  " + code92);
        System.out.print("  " + code47);
        System.out.print(code95);
        System.out.print(code40 + " ");
        System.out.print(code41);
        System.out.println(code92);
        System.out.print(" " + code47);
        System.out.println("      " + code92);
        System.out.print(code47);
        System.out.print(code95);
        System.out.print(code95);
        System.out.print(code95);
        System.out.print(code95);
        System.out.print(code47);
        System.out.print(code92);
        System.out.print(code95);
        System.out.print(code95);
        System.out.println(code92);
        System.out.println();

        System.out.println("Блок 8 - Манипуляции с сотнями, десятками и единицами числа");

        int number = 123;
        int numbHundreds = number / 100;
        int numbTens = number / 10 % 10;
        int numbUnits = number % 100 % 10;
        int numbSum = numbHundreds + numbTens + numbUnits;
        int numbProduct = numbHundreds * numbTens * numbUnits;
        System.out.println("Число " + number + " Содержит: ");
        System.out.println("  " + "Сотен: " + numbHundreds);
        System.out.println("  " + "Десятков: " + numbTens);
        System.out.println("  " + "Едениц: " + numbUnits);
        System.out.println("Сумма разрядов = " + numbSum);
        System.out.println("Произведение разрядов = " + numbProduct);
        System.out.println();

        System.out.println("Блок 9 - Перевод секунд в часы, минуты и секунды");

        int timeSec = 86399;
        int timeMinutes = timeSec / 60;
        int timeHours = timeSec / 3600;
        System.out.println(timeHours + ":" + timeMinutes + ":" + timeSec);
        System.out.println();
    }
}