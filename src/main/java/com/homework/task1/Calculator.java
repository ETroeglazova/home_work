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

        switch (operation) {
            case ("+"):
                System.out.printf("Решение: %.4f", firstNumber + secondNumber);
                break;
            case ("-"):
                System.out.printf("Решение: %.4f", firstNumber - secondNumber);
                break;
            case ("*"):
                System.out.printf("Решение: %.4f", firstNumber * secondNumber);
                break;
            case ("/"):
                System.out.printf("Решение: %.4f", firstNumber / secondNumber);
                break;
            default:
                System.err.println("Некорректная операция");
        }


    }
}
