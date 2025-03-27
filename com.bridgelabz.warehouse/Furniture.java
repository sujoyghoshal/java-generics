package com.bridgelabz.warehouse;

public class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, double price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + getName() + " | Material: " + material + " | Price: $" + getPrice());
    }
}
