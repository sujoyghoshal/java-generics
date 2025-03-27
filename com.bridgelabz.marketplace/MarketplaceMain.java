package com.bridgelabz.marketplace;

public class MarketplaceMain {
    public static void main(String[] args) {
        // Creating products
        Book book1 = new Book("Java Programming", 45, BookCategory.EDUCATIONAL, "James Gosling");
        Clothing tshirt = new Clothing("T-Shirt", 20, ClothingCategory.MEN, "L");
        Gadget laptop = new Gadget("MacBook", 1200, GadgetCategory.LAPTOP, "Apple");

        // Creating Catalog
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book1);
        catalog.addProduct(tshirt);
        catalog.addProduct(laptop);

        // Displaying all products
        catalog.displayCatalog();

        // Applying Discounts
        System.out.println("\nApplying Discounts:");
        ProductCatalog.applyDiscount(book1, 10);
        ProductCatalog.applyDiscount(tshirt, 20);
        ProductCatalog.applyDiscount(laptop, 5);

        // Displaying updated catalog
        catalog.displayCatalog();
    }
}
