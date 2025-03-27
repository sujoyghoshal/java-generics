package com.bridgelabz.warehouse;

import java.util.ArrayList;
import java.util.List;

public class WarehouseMain {
    public static void main(String[] args) {
        // Creating items
        Electronics laptop = new Electronics("Laptop", 1500, "Dell");
        Groceries apple = new Groceries("Apple", 2.5, "2025-06-01");
        Furniture chair = new Furniture("Office Chair", 120, "Wood");

        // Storing Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(laptop);

        // Storing Groceries
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(apple);

        // Storing Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(chair);

        // Displaying Items
        System.out.println("=== Electronics Storage ===");
        electronicsStorage.displayItems();
        System.out.println("\n=== Groceries Storage ===");
        groceriesStorage.displayItems();
        System.out.println("\n=== Furniture Storage ===");
        furnitureStorage.displayItems();

        // Using Wildcard method to display all items
        System.out.println("\n=== Displaying All Items Using Wildcard ===");
        List<WarehouseItem> allItems = new ArrayList<>();
        allItems.add(laptop);
        allItems.add(apple);
        allItems.add(chair);
        Storage.displayAllItems(allItems);
    }
}
