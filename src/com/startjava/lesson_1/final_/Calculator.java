package com.startjava.lesson_1.final_;
public class Calculator {
    public static void main(String[] args) {
        int firstNum = 10;
        int secondNum = 5;
        int result = 0;
        int out = firstNum;
        char operand = '^';

        if (operand ==  '+' ) {
            result = firstNum + secondNum;
        } else if (operand == '-') {
            result = firstNum - secondNum;
        } else if (operand == '*') {
             result = firstNum * secondNum;
        } else if (operand == '/') {
             result = firstNum / secondNum;
        } else if (operand == '%') {
            result = firstNum % secondNum;
        }
        if (operand != '^' ){
            System.out.println(firstNum + " " + operand + " " + secondNum + " = " + result);
        } else if (operand == '^') {
            for (int i = 1; i < secondNum; i++ ) {
                out = out * firstNum;
            }
            System.out.println(firstNum + " " + operand + " " + secondNum + " = " + out);
        }

    }

}