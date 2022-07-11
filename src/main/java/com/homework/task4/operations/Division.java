package com.homework.task4.operations;

public class Division extends Operation {
    @Override
    public double execute() throws ArithmeticException {
        if (getSecondNum() == 0)
            throw new ArithmeticException("Деление на ноль невозможно!");

        return getFirstNum() / getSecondNum();
    }
}
