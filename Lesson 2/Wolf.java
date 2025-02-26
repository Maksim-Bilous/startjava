public class Wolf {
    private String gender;
    private String nickName;
    private String color;
    private float weight;
    private int age;

    // Сеттеры
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickname(String nickName) {
        this.nickName = nickName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if (age > 8){
            System.out.println("Некорректный возраст");
        } else if (age <= 8) {
        this.age = age;
        }
    }

    // Геттеры
    public String getGender() {
        return gender;
    }

    public String getNickname() {
        return nickName;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge () {
        if(age < 8){
            return age;
        } else {
            return 0;
        }
    }

    // Методы
    public void move() {
        System.out.println(nickName + " Идет");
    }

    public void sit() {
        System.out.println(nickName + " Сидит");
    }

    public void run() {
        System.out.println(nickName + " Бежит");
    }

    public void howl() {
        System.out.println(nickName + " Воет");
    }

    public void hunt() {
        System.out.println(nickName + " Охотится");
    }
}
