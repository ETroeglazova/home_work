package com.homework.task4.operations;

public class Division extends Operation {
    @Override
    public double execute() {
        return getFirstNum() / getSecondNum();
    }
}
