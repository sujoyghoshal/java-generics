package com.bridgelabz.marketplace;

public class Product<T> {
    private String name;
    private double price;
    private T category;  // Generic Category

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product: " + name + " | Category: " + category + " | Price: $" + price);
    }
}
