package com.homework.task3;

public class MaxNegativeAndMinPositive {
    public static void main(String[] args) {
        int[] intArray = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) ((Math.random() * 21) - 10);
        }
        int maxNegative = -11;
        int maxNegIndex = 0;
        int minPositive = 11;
        int minPosIndex = 0;

        for (int j = 0; j < intArray.length; j++) {
            int num = intArray[j];

            if (num < 0 && num > maxNegative) {
                maxNegative = num;
                maxNegIndex = j;
            } else if (num > 0 && num < minPositive) {
                minPositive = num;
                minPosIndex = j;
            }
        }

        if (maxNegative > -11 && minPositive < 11) {
            intArray[minPosIndex] = maxNegative;
            intArray[maxNegIndex] = minPositive;
        }
    }
}
