package com.homework.task3.sweets;

public class JellyBean extends Sweet{
    private String[] flavors;

    public JellyBean(String name, double weight, double price, String[] flavors) {
        super(name, weight, price);
        this.flavors = flavors;
    }

    public String[] getFlavors() {
        return flavors;
    }

    public void setFlavors(String[] flavors) {
        this.flavors = flavors;
    }

    @Override
    public String toString() {
        String flavors = "unknown";
        if (this.flavors != null) {
            flavors = "";
            for (String flavor : this.flavors) {
                flavors += flavor + ", ";
            }
        }
        return super.toString() + " that contains jelly beans of " + this.flavors.length + " flavors, such as: " + flavors + "in a set";
    }
}
