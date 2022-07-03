package com.homework.task3.sweets;

public class SweetBox {
    public static void main(String[] args) {
        Sweet[] sweets = new Sweet[]{
                new Candy("Dumple", 150, 241, "Fazer",
                        "milk chocolate that contains toffee inside it"),
                new Candy("Chocolate truffle", 203.5, 497.6, "Ameri", null),
                new Donut("Cinnamon Sugar", 159.7, 115, null,
                        new String[]{"cinnamon", "sugar"}, 3),
                new Donut("Cherry vanilla", 104.9, 70, "cherry vanilla cream",
                        new String[]{"ganache", "maraschino cherry"}, 2),
                new Donut("Cappuccino", 111.3, 82.6, "cappuccino chocolate",
                        new String[]{"ganache", "chocolate rice"}, 2),
                new JellyBean("Bean Boozled", 54, 569,
                        new String[]{"liver and onion", "cappuccino", "old bandage", "pomegranate", "rotten egg",
                                "buttered popcorn", "toothpaste", "blueberry", "vomiting", "peach", "stinky beetle",
                                "fried marshmallow", "snots", "juicy pear", "slop", "birthday cake", "smelly socks",
                                "tutti-frutti", "rotten fish", "strawberry-banana cocktail"}),
                new ChocolateBar("Toblerone", 300, 498, 3, "Milk chocolate",
                        new String[]{"honey", "almond nougat"}),
                new ChocolateBar("Tony's Chocolonely", 188, 499, 4, "Dark chocolate",
                        new String[]{"almond", "sea salt"}),
                new ChocolateBar("Karl Fazer Blue", 190, 309.9, 5,
                        "Milk and white chocolate", null)
        };

        double boxWeight = 0.0;
        double boxPrice = 0.0;

        for (Sweet sweet : sweets) {
            boxWeight += sweet.getWeight();
            boxPrice += sweet.getPrice();
            System.out.println(sweet);
        }
    }
}
