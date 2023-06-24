package io.codelex.oop.summary.ordersandinvoices;

import java.math.BigDecimal;

class ItemImpl implements Item {
    private final String name;
    private final BigDecimal price;
    private final String additionalInfo;

    public ItemImpl(String name, BigDecimal price, String additionalInfo) {
        this.name = name;
        this.price = price;
        this.additionalInfo = additionalInfo;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String fullInfo() {
        return name + ", " + price.setScale(2) + " EUR, " + additionalInfo;
    }
}
