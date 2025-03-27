package com.bridgelabz.warehouse;

public class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + getName() + " | Brand: " + brand + " | Price: $" + getPrice());
    }
}
