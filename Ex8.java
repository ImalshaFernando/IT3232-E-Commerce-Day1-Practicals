/*8)
Implement classes for the give scenario:
-A retail store which can store multiple products fruits,vegetables,grocery,etc..
-display the availbale products like price, name, quantity. */

import java.util.ArrayList;

// Base class
abstract class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract void displayInfo();
}

// Subclass for Fruits
class Fruit extends Product {
    public Fruit(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Fruit: " + getName() + " - Price: $" + getPrice() + " - Quantity: " + getQuantity());
    }
}

// Subclass for Vegetables
class Vegetable extends Product {
    public Vegetable(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Vegetable: " + getName() + " - Price: $" + getPrice() + " - Quantity: " + getQuantity());
    }
}

// Subclass for Grocery Items
class Grocery extends Product {
    public Grocery(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Grocery: " + getName() + " - Price: $" + getPrice() + " - Quantity: " + getQuantity());
    }
}

// Store class to manage products
class Store {
    private ArrayList<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            product.displayInfo();
        }
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Store store = new Store();

        store.addProduct(new Fruit("Orange", 2.5, 50));
        store.addProduct(new Vegetable("Pumpkin", 3.2, 30));
        store.addProduct(new Grocery("Sugar", 1.0, 20));

        store.displayProducts();
    }
}
