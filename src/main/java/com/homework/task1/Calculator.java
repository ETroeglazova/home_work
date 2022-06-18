package com.homework.task1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Укажите опреацию (+, -, * либо /):");
        String operation = scanner.next();

        System.out.println("Введите второе число:");
        double secondNumber = scanner.nextDouble();

        double result = 0;

        switch (operation) {
            case ("+"):
                result = firstNumber + secondNumber;
                break;
            case ("-"):
                result = firstNumber - secondNumber;
                break;
            case ("*"):
                result = firstNumber * secondNumber;
                break;
            case ("/"):
                result = firstNumber / secondNumber;
                break;
            default:
                System.out.println("Некорректная операция");
        }

        System.out.printf("Решение: %.4f", result);
    }
}
