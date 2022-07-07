package com.homework.task4.operations;

public class Addition extends Operation{

    @Override
    public double execute() {
        return getFirstNum() + getSecondNum();
    }
}
