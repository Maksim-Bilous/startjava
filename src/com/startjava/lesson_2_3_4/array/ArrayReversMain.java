package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversMain {

    public static void main(String[] args) {

        ArrayRevers arr = new ArrayRevers();
        Scanner scannerForIndex = new Scanner(System.in);
        Scanner scannerForElem = new Scanner(System.in);

        System.out.print("Введите длинну массива: ");
        int arrayLen = scannerForIndex.nextInt();
        int[] arrayForRevers = new int[arrayLen];

        for (int i = 0; i < arrayForRevers.length; i++) {
            System.out.print("Заполните массив: ");
            arrayForRevers[i] = scannerForElem.nextInt();
        }

        System.out.print("Получившийся массив: " );
            System.out.println(Arrays.toString(arrayForRevers) );

        arr.makeRevers(arrayForRevers);





    }


}
