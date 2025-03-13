package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class FactorialArr {
    private long[] arrayForFact = new long[] {-8, 0, 9};


    // геттеры

    public long[] getArrayForFact() {
        return arrayForFact;
    }


    // методы - проверка на отрицательность и метод получения факториала

    public long simpleFactorial(long n) {
        long factorial = 1;
        if (n == 1 || n == 0 || n < 0){
            return n;
        }
        factorial = n * simpleFactorial(n - 1);

        return factorial;
    }

    public void arrayFactorial(long[] arrayForFact) {
        long[] resArray = new long[arrayForFact.length];
        for (long i = 0; i < arrayForFact.length; i++) {
            if (arrayForFact[(int) i] < 0) {
                System.out.println("Ошибка: " + arrayForFact[(int) i] + "! не определен");
            } else {
                arrayForFact[(int) i] = simpleFactorial(arrayForFact[(int) i]);
                resArray[(int) i] = arrayForFact[(int) i];
            }
        }
        System.out.println(Arrays.toString(resArray));
    }






 }
