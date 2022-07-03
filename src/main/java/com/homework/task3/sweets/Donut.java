package com.homework.task3.sweets;

public class Donut extends Sweet {
    private String filling;
    private String[] toppings;
    private int quantity;

    public Donut(String name, double weight, double price, String filling, String[] toppings, int quantity) {
        super(name, weight, price);
        this.filling = filling;
        this.quantity = quantity;
        this.toppings = toppings;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        String toppings = "no ";
        if (this.toppings != null) {
            toppings = "";
            for (String topping : this.toppings)
                toppings += topping + " ";
        }

        return getQuantity() + " pieces of " + super.toString() + " donuts with "
                + toppings + "toppings and " + this.filling + " filling";
    }
}
