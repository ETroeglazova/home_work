package com.homework.task2;

import com.homework.task1.Calculator;

import java.util.Scanner;

public class TaskSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание, которое необходимо выполнить\n" +
                "(1 - Калькулятор, 2 - Определние самых длинных слов:");

        int taskNumber = scanner.nextInt();
        switch (taskNumber){
            case 1:
                Calculator.main(null);
                break;
            case 2:
                MaxLengthString.main(null);
                break;
            default:
                System.err.println("Должны быть числа 1 или 2");
        }
    }
}
