package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class DelArrayElements {
    private int fixArraySize = 15;

    // getters

    public int getFixArraySize() {
        return fixArraySize;
    }

    // methods

    public void takeToZero1() {
        int[] defArray = new int[] {-1, 15, 0, 14};
        Random elemIndex = new Random();
        int tempElemIndex = elemIndex.nextInt(defArray.length);
        for (int i = 0; i < defArray.length ; i++) {
            if (defArray[i] > defArray[tempElemIndex]) {
                defArray[i] = 0;
            }
        }
        System.out.println("Эелементы не должны быть больше: " + tempElemIndex + "\nЭлемент по индексу: " + defArray[tempElemIndex]);
        System.out.println(Arrays.toString(defArray));
    }

    public void takeToZero2() {
        double[] defArrayDouble = new double[15];
        Random elemForDoubleArr = new Random();
        for (int i = 0; i < defArrayDouble.length; i++) {
            defArrayDouble[i] = (double) Math.random();
        }
        // вывод исходного массива
        System.out.print("Исходный массив: \n[");
        for (int j = 0; j < 8; j++) {
            System.out.printf("%.3f", defArrayDouble[j]);
            System.out.print("; ");
        }
        System.out.print("]\n");
        System.out.print("[");
        for (int y = 8; y < 15; y++) {
            System.out.printf("%.3f" , defArrayDouble[y]);
            System.out.print("; ");
        }
        System.out.print("]");
        // конец вывода исходного массива и сравнение элемента с другими
        Random indexOfArr = new Random();
        int tempIndexOfArr = indexOfArr.nextInt(defArrayDouble.length);
            for (int i = 0; i < defArrayDouble.length ; i++) {
            if (defArrayDouble[i] > defArrayDouble[tempIndexOfArr]) {
                defArrayDouble[i] = 0;
            }

        }
        // вывод измененного массива
        System.out.println("\n\nЭелементы не должны быть больше: " + tempIndexOfArr);
        System.out.printf("Элемент по индексу: " + "%.3f", defArrayDouble[tempIndexOfArr]);
        System.out.print( "\nИзмененный массив: \n[");
        for (int j = 0; j < 8; j++) {
            System.out.printf("%.3f", defArrayDouble[j]);
            System.out.print("; ");
        }
        System.out.print("]\n");
        System.out.print("[");
        for (int y = 8; y < 15; y++) {
            System.out.printf("%.3f" , defArrayDouble[y]);
            System.out.print("; ");
        }

    }
}
