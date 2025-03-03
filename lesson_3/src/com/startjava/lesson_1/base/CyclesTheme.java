package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
    System.out.println("Блок 1 - Подсчет суммы четных и нечетных чисел");
    int rangeStart =-10;
    int rangeEnd = 21;
    int sumEven = 0;
    int sumOdd = 0;
    int rangeStSave = rangeStart;
    do {
        if(rangeStart % 2 == 0){
            sumEven += rangeStart;
        }else if (rangeStart % 2 != 0){ 
            sumOdd += rangeStart;
        }
        rangeStart++;
    }while(rangeStart <= rangeEnd);
    System.out.println("В отрезке [" + rangeStSave + ":" + rangeEnd + "]" + "сумма четных чисел = " + sumEven + ", а сумма нечетных = " + sumOdd);
    System.out.println();

    System.out.println("Блок 2 - Вывод чисел между min и max в порядке убывания");

    int fVariable = 10;
    int sVariable = 5;
    int tVariable = -1;
    int max = 0;
    int min = 0;
    if (fVariable < sVariable && fVariable < tVariable) {
        min = fVariable;
    } else if (fVariable > sVariable && fVariable > tVariable) {
        max = fVariable;
    } else if (sVariable > fVariable && sVariable > tVariable) {
        max = sVariable;
    } else if (sVariable < fVariable && sVariable < tVariable) {
        min = sVariable;
    } else if (tVariable < fVariable && tVariable < sVariable) {
        min = tVariable;
    } else if (tVariable > fVariable && tVariable > sVariable) {
        max = tVariable;
    }
    System.out.println("Вывод чисел из интервала в порядке убывания:");
    for (int i = max;i >= min -1 ;i-- ) {
        System.out.print(" " + i + ", ");
    }
    System.out.println();

    System.out.println("Блок 3 - Вывод реверсивного числа и суммы его цифр");

    int num = 1234;
    int temp = num;
    int x = 0;
    int sumDigit = 0;
    while(temp != 0) {
        x = temp % 10;
        temp /= 10;
        sumDigit += x;
        System.out.print(x + " ");
    }

    System.out.println("\nСумма цифр в числе " + num + " равна " + sumDigit);
    System.out.println();

    System.out.println("Блок 4 - вывод чисел в несколько строк");

    int halfRangeStart = 1;
    String flag = "";

    for(int i = halfRangeStart ; i <= 23 ; i++){
        if (i % 2 != 0) {
            System.out.printf("%3s%05d%n" , flag , i);
        }
    }
        System.out.println();

        System.out.println("Блок 5 - Проверка количества двоек числа на четность/нечетность");
        int num4 = 3242592;
        int num4Safe = num4;
        int y = 0;
        int unit = 0;

        while(num4 != 0) {
            unit = num4 % 10;
            if (unit == 2) {
                y++;
            }
            num4 /= 10;
        }
            
        if (y % 2 == 0) {
            System.out.println("В " + num4Safe + " четное " + "(" + y + ") количество двоек");
        }else if (y % 2 != 0) {
            System.out.println("В " + num4Safe + " нечетное " + "(" + y + ") количество двоек");
        }
        System.out.println();

        System.out.println("Блок 6 - Вывод геометрических фигур");
        char square = '*';
        char triangle1 ='#';
        char triangle2 = '$';
        for (int i = 0 ; i <= 5 ; i++ ) {
            for (int j = 0 ; j < 9 ; j++ ) {
                System.out.print(square);
            }
            System.out.println(square);
            
        }
        System.out.println();
        int treanTemp = 5;
            while (treanTemp >= 1) {
                int z = 1;
                while (z <= treanTemp) {
                System.out.print(triangle1);
                z++;
            }
            System.out.println("");
            treanTemp--;
    }
        System.out.println();

        int trean2Temp = 3;
        int finColStr = 2 * trean2Temp - 1;
        int width = 1;
        int counter = 1;
        int d = 1;
        do {
            int m = 0;
            do {
                System.out.print(triangle2);
            } while (++m < width);
            System.out.println();
            if(counter == trean2Temp)
                d = -1;
                width += d;
            }while (++counter <= finColStr);
            System.out.println();

            System.out.println("Блок 7 - Вывод ASCII-символов");

            System.out.println("DECIMAL" + "   CHARACTER" + "   DESCRIPTION");
            System.out.println();
            for(int asciiDigit = 33 ; asciiDigit <= 47 ; asciiDigit += 2 ){
                System.out.println("  " + asciiDigit + "          " + (char)asciiDigit + "          " + Character.getName((char)asciiDigit));
                System.out.println();
            }
            for(int asciiDigit2 = 98 ; asciiDigit2 <= 122 ; asciiDigit2 +=2){
                System.out.println("  " + asciiDigit2 + "          " + (char)asciiDigit2 + "          " + Character.getName((char)asciiDigit2));
                System.out.println();
            }
            System.out.println("Блок 8 - Проверка, является ли число палиндромом");

            int numPolindrom = 1234321;
            int tempPalindrom = numPolindrom;
            int numFirstPart = 0;
            int numSecondPart = 0;
            numFirstPart = numPolindrom / 1000 / 10;
            numSecondPart = numPolindrom % 1000;
             int reversNum = 0;

            while (numSecondPart != 0) {
                reversNum = reversNum * 10 + numSecondPart % 10;
                numSecondPart /= 10;
            }
            if (numFirstPart == reversNum) {
                System.out.println(tempPalindrom + " - палиндром");
            }else if (numFirstPart != reversNum) {
                System.out.println(tempPalindrom + " - не палиндром");
            }
            System.out.println();
            System.out.println("Блок 9 - Проверка, является ли число счастливым");

            int luckNum = 123321;
            int tempLuckNum = luckNum;
            int luckNumP1 = luckNum / 1000;
            int luckNumP2 = luckNum % 1000;
            int tempLuckNumP1 = luckNumP1;
            int tempLuckNumP2 = luckNumP2;
            int sum1 = 0;
            int sum2 = 0;

            while(luckNumP1 !=0 && luckNumP2 != 0) {
                sum1 += luckNumP1 % 10;
                luckNumP1 /= 10;
                sum2 += luckNumP2 % 10;
                luckNumP2 /= 10;
            }
            if (sum1 == sum2) {
                System.out.println ("число " + tempLuckNum + " - счастливое \n" + "cумма " + tempLuckNumP1 + " = " + sum1 + "\n" + "сумма " + tempLuckNumP2 + " = " + sum2);
            }else if (sum1 != sum2) {
                System.out.println ("число " + tempLuckNum + " - не является счастливым \n" + "cумма " + tempLuckNumP1 + " = " + sum1 + "\n" + "сумма " + tempLuckNumP2 + " = " + sum2);
            }
            System.out.println(); 

            System.out.println("Блок 10 - Таблица умножения Пифагора");
            int xAxis = 2; // горизонт
            int yAxis = 2; // вертикаль

            System.out.println("  |" + "2    3       4       5       6       7        8      9");
            System.out.println("__|________________________________________________________");

            for (yAxis = 2; yAxis <= 9 ; yAxis++) {
                System.out.print(yAxis + " |");
                for (xAxis = 2; xAxis <= 9 ;xAxis++ ) {
                    System.out.print(xAxis * yAxis + "\t");
                }
                System.out.println();
                
            }
    }
    }
    
