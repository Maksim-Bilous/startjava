package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayRevers {
    // methods

    public void makeRevers(int[] arrayForRevers) {
        for (int i = 0; i < arrayForRevers.length / 2; i++) {
            int temp = arrayForRevers[i];
            arrayForRevers[i] = arrayForRevers[arrayForRevers.length - i - 1];
            arrayForRevers[arrayForRevers.length - i - 1] = temp;


        }
        System.out.println("Перевернутый массив: " + Arrays.toString(arrayForRevers));
    }
}
