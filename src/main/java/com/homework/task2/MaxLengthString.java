package com.homework.task2;

import java.util.Scanner;

public class MaxLengthString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер строкового массива:");
        int size = scanner.nextInt();

        System.out.println("Введите слова по одному с каждой строки.\n" +
                "Количество слов соответствует размеру массива:");

        int maxLength = 0;
        String[] stringArray = new String[size];
        for (int i = 0; i < size; i++) {
            stringArray[i] = scanner.next();
            int strLen = stringArray[i].length();
            if (strLen > maxLength)
                maxLength = strLen;
        }

        for (int k = 0; k < size; k++) {
            String word = stringArray[k];
            if (word.length() < maxLength)
                continue;
            System.out.println(word);
        }
    }
}
