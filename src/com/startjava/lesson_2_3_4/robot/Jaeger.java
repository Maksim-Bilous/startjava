package com.startjava.lesson_2_3_4.robot;
public class Jaeger {
    private String modelName;
    private String bodyLanguage;
    private String weapon;
    private float hight;
    private float weight;
    private int speed;
    private int armor;

    // setters

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setBodyLanguage(String bodyLanguage) {
        this.bodyLanguage = bodyLanguage;
    }

    public void setHight(float hight) {
        this.hight = hight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    // getters

    public String getModelName() {
        return modelName;
    }

    public String getBodyLanguage() {
        return bodyLanguage;
    }

    public float getHight() {
        return hight;
    }

    public float getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getArmor() {
        return armor;
    }

    public String getWeapon() {
        return weapon;
        }

    // methos

    public void scanning() {
        System.out.println("Scanning...");
        System.out.println("No Kaiju detected");
    }

    public boolean drift() {
        return true;
    }

    public void useWeapon() {
        System.out.println(getWeapon() + " activated");
    }

    // constructor

    public Jaeger(String modelName , String bodyLanguage , String weapon , float hight , float weight , int speed) {
        this.modelName = modelName;
        this.bodyLanguage = bodyLanguage;
        this.weapon = weapon;
        this.hight = hight;
        this.weight = weight;
        this.speed = speed;
    }

    public Jaeger() {

    }

}