package com.homework.task4.operations;

public class Multiplication extends Operation{
    @Override
    public double execute() {
        return getFirstNum() * getSecondNum();
    }
}
