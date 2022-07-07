package com.homework.task4.operations;

public class Subtraction extends Operation {

    @Override
    public double execute() {
        return getFirstNum() - getSecondNum();
    }
}
