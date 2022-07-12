package com.homework.task7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число:");
            double firstNumber = scanner.nextDouble();

            System.out.println("Укажите опреацию (+, -, * либо /):");
            String sign = scanner.next();

            System.out.println("Введите второе число:");
            double secondNumber = scanner.nextDouble();

            scanner.close();
            Operation operation = new Operation(firstNumber, secondNumber);

            switch (sign) {
                case ("+"):
                    System.out.printf("Результат: %.4f", operation.add());
                    break;
                case ("-"):
                    System.out.printf("Результат: %.4f", operation.subtract());
                    break;
                case ("*"):
                    System.out.printf("Результат: %.4f", operation.multiply());
                    break;
                case ("/"):
                    System.out.printf("Результат: %.4f", operation.divide());
                    break;
                default:
                    throw new RuntimeException("Некорректная операция");
            }
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
