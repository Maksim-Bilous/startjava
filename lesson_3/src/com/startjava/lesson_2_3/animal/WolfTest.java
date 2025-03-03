package com.startjava.lesson_1.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf mufasa = new Wolf();

        mufasa.setNickname("Муфаса");
        mufasa.setGender("Мужчина");
        mufasa.setColor("Серый");
        mufasa.setWeight(15.5f);
        mufasa.setAge(9);

        System.out.println("\nИмя волка - " + mufasa.getNickname());
        System.out.println("\nПол волка - " + mufasa.getGender());
        System.out.println("\nОкрас волка - " + mufasa.getColor());
        System.out.println("\nВес волка - " + mufasa.getWeight());
        System.out.println("\nВозраст волка - " + mufasa.getAge() + " год\n");
        
        mufasa.move();
        
        mufasa.run();
        
        mufasa.sit();
        
        mufasa.howl();
        
        mufasa.hunt();
    }
}