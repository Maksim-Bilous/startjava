package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // Блок 1 - Перевод Псевдокода на язык java
        System.out.println("Блок 1 - Перевод Псевдокода на язык java");
        boolean isFemale = false;
        if (!isFemale) {
            System.out.println("Вы Мужчина!");
        } else {
            System.out.println("Вы Женщина!");
        }
        int age = 21;
        if (age > 18) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вы не совершеннолетний");
        }
        float height = 1.76f;
        if (height < 1.8) {
            System.out.println("Ты не можешь пройти на атракцион");
        } else {
            System.out.println("Ты проходишь на атракцион");
        }

        String name = "Maksim";
        char firstLeterNam = name.charAt(0);
        if (firstLeterNam == 'M') {
            System.out.println("Хорошее имя");
        } else if (firstLeterNam == 'I') {
            System.out.println("Все имена хороши");
        } else {
            System.out.println("что - то не так");
        }
        System.out.println();

        // Блок 2 - Поиск большего числа
        System.out.println("Блок 2 - Поиск большего числа");
        int firstNum = 10;
        int secondNum = 5;

        if (firstNum > secondNum) {
            System.out.println(firstNum + " больше " + secondNum);
        } else if (firstNum < secondNum) {
            System.out.println(secondNum + " больше " + firstNum);
        } else {
            System.out.println("Числа равны");
        }
        System.out.println();

        // Блок 3, 4, 5 - Проверка числа
        System.out.println("Блок 3, 4, 5 - Проверка числа");
        int number = -10;
        int firstVar = 123;
        int secondVar = 223;
        if (number % 2 == 0 && number > 0) {
            System.out.println(number + " является положительным и четным");
        } else if (number % 2 != 0 && number > 0) {
            System.out.println(number + " является положительным и нечетным");
        } else if (number % 2 != 0 && number < 0) {
            System.out.println(number + " является отрицательным и нечетным");
        } else if (number % 2 == 0 && number < 0) {
            System.out.println(number + " является отрицательным и четным");
        } else {
            if (number == 0) {
                System.out.println("Вы ввели нуль");
            }
        }
        System.out.println();

        // Блок 6 - Подсчет начисленных банком %
        System.out.println("Блок 6 - Подсчет начисленных банком %");
        double deposit = 321123.59;
        double percent = 0.0;
        System.out.println("Сумма вклада " + deposit);
        if (deposit < 100000) {
            percent = 5 * deposit / 100;
            deposit += percent;
            System.out.println("сумма начислений: " + percent);
            System.out.println("Итоговая сумма: " + deposit);
        } else if (deposit >= 100000 && deposit < 300000) {
            percent = 7 * deposit / 100;
            deposit += percent;
            System.out.println("сумма начислений: " + percent);
            System.out.println("Итоговая сумма: " + deposit);
        } else if (deposit > 300000) {
            percent = 10 * deposit / 100;
            deposit += percent;
            System.out.println("сумма начислений: " + percent);
            System.out.println("Итоговая сумма: " + deposit);
        }
        System.out.println();

        // Блок 7 - Определение оценки по каждому предмету
        System.out.println("Блок 7 - Определение оценки по каждому предмету");
        int storyPerc = 59;
        int programmingPerc = 92;
        float gradeStory = 0.0f;
        float gradeProgramming = 0.0f;

        if (storyPerc <= 60) {
            gradeStory = 2.0f;
        } else if (storyPerc > 60 && storyPerc < 73) {
            gradeStory = 3.0f;
        } else if (storyPerc > 73 && storyPerc < 91) {
            gradeStory = 4.0f;
        } else if (storyPerc > 91) {
            gradeStory = 5.0f;
        }
        if (programmingPerc <= 60) {
            gradeProgramming = 2.0f;
        } else if (programmingPerc > 60 && programmingPerc < 73) {
            gradeProgramming = 3.0f;
        } else if (programmingPerc > 73 && programmingPerc < 91) {
            gradeProgramming = 4.0f;
        } else if (programmingPerc > 91) {
            gradeProgramming = 5.0f;
        }
        float midScoreGrade = (gradeProgramming + gradeStory) / 2;
        float midScorePerc = (programmingPerc + storyPerc) / 2;
        System.out.println("История: " + gradeStory);
        System.out.println("Программирование: " + gradeProgramming);
        System.out.println("Средний балл оценок по предметам: " + midScoreGrade + " балла");
        System.out.println("Средний % по предметам: " + midScorePerc + "%");
        System.out.println();

        // Блок 8 - Расчет годовой прибыли
        System.out.println("Блок 8 - Расчет годовой прибыли");
        float salesMon = 13025.233f;
        float rentMon = 3050.018f;
        float primeCostMon = 5204.729f;
        float yrProfit = salesMon * 12;
        float finalYrProf = yrProfit - ((rentMon * 12) + (primeCostMon * 12));

        if (finalYrProf < 0 && finalYrProf != 0) {
            System.out.println(" Прибыль за год: " + finalYrProf + " руб.");
        } else if (finalYrProf > 0 && finalYrProf != 0) {
            System.out.println(" Прибыль за год: +" + finalYrProf + " руб.");
        }
    }
}