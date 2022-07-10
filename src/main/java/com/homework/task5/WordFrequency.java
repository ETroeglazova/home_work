package com.homework.task5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        SortedMap<String, Integer> words = new TreeMap<>();
        try(BufferedReader reader = new BufferedReader(
                new FileReader("src/main/java/com/homework/task5/InputData"))) {
            String line = reader.readLine();

            for (String word : line.split(" ")) {
                if (words.containsKey(word))
                    words.put(word, words.get(word) + 1);
                else
                    words.put(word, 1);
            }

            SortedSet<Integer> values = new TreeSet<>(words.values());
            Integer mostFrequentRepetition = values.last();
            List<String> mostOftenWords = new ArrayList<>();

            for (Map.Entry<String, Integer> wordsEntry : words.entrySet()) {
                String k = wordsEntry.getKey();
                Integer v = wordsEntry.getValue();
                System.out.printf("Слово \"%s\" встретилось %d раз(а)\n",
                        k, v);

                if (v.equals(mostFrequentRepetition))
                    mostOftenWords.add(k);
            }

            System.out.printf("Наиболее часто встречающееся(иеся) слово(а): %s, " +
                    "количество повторений в файле: %d", mostOftenWords, mostFrequentRepetition);

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
