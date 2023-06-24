package io.codelex.oop.summary.ordersandinvoices;

import java.math.BigDecimal;

public class OrderProgram {
    public static void main(String[] args) {
        Order order = new Order();

        Item milk = new FoodItem("Milk", new BigDecimal("0.75"), "01.04.2022");
        Item radio = new ItemImpl("Radio", new BigDecimal("25.00"), "power: 100W");
        Item bucket = new ItemImpl("Bucket", new BigDecimal("5.00"), "color: red");
        Service itemPacking = new ItemPacking();

        order.addItem(milk);
        order.addItem(radio);
        order.addItem(bucket);
        order.addItem(itemPacking);

        Invoice invoice = new Invoice(order);

        System.out.println(invoice.getFormattedInvoice());
    }
}

