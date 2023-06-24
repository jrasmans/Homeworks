package io.codelex.oop.summary.ordersandinvoices;

import java.math.BigDecimal;

class FoodItem implements Item {
    private final String name;
    private final BigDecimal price;
    private final String expirationDate;

    public FoodItem(String name, BigDecimal price, String expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String fullInfo() {
        return name + ", " + price.setScale(2) + " EUR, best before: " + expirationDate;
    }
}

