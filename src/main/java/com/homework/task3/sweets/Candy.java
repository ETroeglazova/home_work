package com.homework.task3.sweets;

public class Candy extends Sweet{
    private String manufacturer;
    private String description;

    public Candy(String name, double weight, double price, String manufacturer, String description) {
        super(name, weight, price);
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        if (this.description == null)
            this.description = "";
        else
            this.description = " " + this.description;

        return super.toString() + this.description + " candies manufactured by " + this.manufacturer;
    }
}
