package com.homework.task7;

public class Operation {
    private double firstNum;
    private double secondNum;

    public Operation(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public double getFirstNum() {
        return firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public double add() {
        return getFirstNum() + getSecondNum();
    }

    public double subtract() {
        return getFirstNum() - getSecondNum();
    }

    public double multiply() {
        return getFirstNum() * getSecondNum();
    }

    public double divide() throws ArithmeticException {
        if (getSecondNum() == 0)
            throw new ArithmeticException("Деление на ноль невозможно!");

        return getFirstNum() / getSecondNum();
    }
}
