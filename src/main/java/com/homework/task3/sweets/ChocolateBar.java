package com.homework.task3.sweets;

public class ChocolateBar extends Sweet{
    private int quantity;
    private String type;
    private String[] fillings;

    public ChocolateBar(String name, double weight, double price, int quantity, String type, String[] fillings) {
        super(name, weight, price);
        this.quantity = quantity;
        this.type = type;
        this.fillings = fillings;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getFillings() {
        return fillings;
    }

    public void setFillings(String[] fillings) {
        this.fillings = fillings;
    }

    @Override
    public String toString() {
        String fillings = "";
        if (this.fillings != null) {
            fillings = " filled with";
            for (String filling : this.fillings)
                fillings += " " + filling;
        }
        return this.quantity + " pieces of " + super.toString() + " " + this.type + " bars" + fillings;
    }
}
