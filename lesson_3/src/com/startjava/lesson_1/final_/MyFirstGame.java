package com.startjava.lesson_1.final_;
import java.util.Scanner;
public class MyFirstGame {
    public static void main(String[] args) {
        int playerDigit;
        int pcDigit = 75;
        int min = 1;
        int max = 100;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Введите число: ");
        playerDigit = scanner.nextInt();
            if (playerDigit == pcDigit){
                System.out.println("Угадал");
                break;
            }else if (playerDigit <= pcDigit) {
                System.out.println(playerDigit + " меньше того, что загадал компьютер");
            }else if (playerDigit >= pcDigit) {
                System.out.println(playerDigit + " больше того, что загадал компьютер");
            }
        }
        if (playerDigit < min) {
            System.out.println("Число меньше диапазона");
            System.exit(0);
        }else if (playerDigit > max) {
            System.out.println("Число больше диапазона");
            System.exit(0);
        }
        }
    }