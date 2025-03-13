package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private double digitA;
    private double digitB;
    private String operation;
    
    
    // setters
    public void setDigitA(double digitA) {
        this.digitA = digitA;
    }

    public void setDigitB(double digitB) {
        this.digitB = digitB;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    // getters

    public double getDigitA() {
        return digitA;
    }

    public double getDigitB() {
        return digitB;
    }

    public String getOperation() {
        return operation;
    }

    // methods

    public void checkOper() {
        if (operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("%") || operation.equals("^") || operation.equals("*") ) {
            
        } else {
            System.out.println("Ошибка: операция '" + operation + "' не поддерживается");
            System.exit(1);
        }
    }

    public double addition() {
        return digitA + digitB;
    }

    public double subtraction() {
        return digitA - digitB;
    }

    public double division() {
        if (digitB == 0) {
            System.out.println("Ошибка: деление на ноль запрещено");
            System.exit(1);
        }
        return digitA / digitB;
    }

    public double divisionWithotRem() {
        return digitA % digitB;
    }

    public double multiplication() {
        return digitA * digitB;
    }

    public double degree() {
        double out = digitA;
            for (int i = 1; i < digitB; i++ ) {
                out = out * digitA;
            }
        return out;
    }

    public double negativeDegree() {
        double out2 = digitA;
            for (int i = -1; i > digitB; i-- ) {
                out2 = out2 * digitA;
            }
        return 1 / out2;
    }
}