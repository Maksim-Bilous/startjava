public class Person {
    String gender = "Male";
    String name = "Maksim";
    int hight = 176;
    float weight = 56.5f;
    int age = 22;

    void move () {
        System.out.println(name + "Идет");
    }

    void siting () {
        System.out.println(name + "Сидит");
    }

    void runing () {
        System.out.println(name + "Бежит");
    }

    void talk () {
        System.out.println(name + "Говорит - Привет!");
    }

    void learnJava () {
        System.out.println(name + "Учит Java");
    }
}