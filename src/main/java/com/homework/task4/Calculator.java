package com.homework.task4;

import com.homework.task4.operations.*;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Operation operation = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Укажите опреацию (+, -, * либо /):");
        String sign = scanner.next();

        System.out.println("Введите второе число:");
        double secondNumber = scanner.nextDouble();

        scanner.close();

        switch (sign) {
            case ("+"):
                operation = new Addition();
                break;
            case ("-"):
                operation = new Subtraction();
                break;
            case ("*"):
                operation = new Multiplication();
                break;
            case ("/"):
                operation = new Division();
                break;
            default:
                System.err.println("Некорректная операция");
        }

        if (operation != null) {
            operation.setFirstNum(firstNumber);
            operation.setSecondNum(secondNumber);
            System.out.printf("Результат: %.4f", operation.execute());
        }

    }
}
