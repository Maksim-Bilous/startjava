package com.startjava.lesson_1.calculator;
import java.util.Scanner;


public class CalculatorTest {
    public static void main(String[] args) {

        Calculator casio = new Calculator();
        Scanner digit = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        Scanner calcContinue = new Scanner(System.in);
        String endOfCode;

    while (true){
        System.out.print("Введите 1 число: ");
        casio.setDigitA(digit.nextLong());

        System.out.print("\nВведите знак операции (+, -, *, /, ^, %): ");
        casio.setOperation(op.nextLine());
        casio.checkOper();

        System.out.print("\nВведите 2 число: ");
        casio.setDigitB(digit.nextLong());
    
        switch (casio.getOperation()) {
            case "+":
                System.out.println("\nрезультат: " + casio.addition());
                break;
            case "-":
                System.out.println("\nрезультат: " + casio.subtraction());
                break;
            case "/":
                System.out.println("\nрезультат: " + casio.division());
                break;
            case "%":
                System.out.println("\nрезультат: " + casio.divisionWithotRem());
                break;
            case "*":
                System.out.println("\nрезультат: " + casio.multiplication());
                break;
            case "^":
                if (casio.getDigitB() > 0) {
                    System.out.println("\nрезультат: " + casio.degree());
                }else if (casio.getDigitB() < 0) {
                    System.out.println("\nрезультат: " + casio.negativeDegree());
                }
                break;
            default:
                System.out.println("Что то пошло не так :(");
        }
        System.out.print("\nПродолжить вычисления [y/n]?");
        endOfCode = calcContinue.nextLine();
        if (endOfCode.equals("n")) {
            break;
        }
    }


    }
}