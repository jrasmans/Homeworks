package io.codelex.classesandobjects.practice;

public class Product {
    private String name;
    private double price;
    private int amount;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", price " + price + ", amount " + amount);
    }

    public void setQuantity(int newAmount) {
        this.amount = newAmount;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Logitech mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Epson EB-U05", 440.46, 1);

        product1.printProduct();
        product2.printProduct();
        product3.printProduct();

        // Change the quantity of product1
        product1.setQuantity(5);
        System.out.println("Updated quantity of product: " + product1.name + ": " + product1.amount);

        // Change the price of product2
        product2.setPrice(899.99);
        System.out.println("Updated price of product: " + product2.name + ": " + product2.price);
    }
}

