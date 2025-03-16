/* 
8) implement classes for the given scenario:
	- A reatail store which can store,edit,and delete 
multible products like fruits, vegetables, grocery, etc..
	- display the avilabe products like price, name, 
	Quantity
*/

import java.util.*;

class Product {
    String name;
    double price;
    int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return name + " - $" + price + " - " + quantity + " in stock";
    }
}

class Store {
    private Product[] products;
    private int productCount;

    public Store(int capacity) {
        products = new Product[capacity]; 
        productCount = 0;  
    }

    // Add
    public void addProduct(String name, double price, int quantity) {
        if (productCount < products.length) {
            products[productCount] = new Product(name, price, quantity);
            productCount++;
            System.out.println(name + " added successfully!");
        } else {
            System.out.println("Store is full!");
        }
    }
   

    // display products
    public void displayProducts() {
        if (productCount == 0) {
            System.out.println("No products available.");
        } else {
            System.out.println("Available Products:");
            for (int i = 0; i < productCount; i++) {
                System.out.println(products[i]);
            }
        }
    }
}

public class RetailStore {
    public static void main(String[] args) {
        Store store = new Store(5); 

        store.addProduct("Apple", 1.99, 50);
        store.addProduct("Carrot", 0.99, 30);
        store.addProduct("Banana", 2.49, 20);
        
        System.out.println();
        store.displayProducts(); 
    }
}
