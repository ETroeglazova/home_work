package com.homework.task4;

import com.homework.task4.operations.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Operation operation = null;
        try {
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
            else
                throw new RuntimeException("Ошибка выполнения. " +
                        "Попробуйте выполнить операцию повторно.");

        }
        catch (InputMismatchException inputMismatchException) {
            System.err.println("Введено число в неверном формате.\n" +
                    "Допустимо использование только чисел и знака \",\" " +
                    "для отделения целой части от десятичной");
        }
        catch (RuntimeException runtimeException) {
            System.err.println(runtimeException.getMessage());
        }

    }
}
