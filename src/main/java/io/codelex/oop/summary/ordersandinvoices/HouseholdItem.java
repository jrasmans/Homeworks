package io.codelex.oop.summary.ordersandinvoices;

import java.math.BigDecimal;

class HouseholdItem extends AbstractItem {
    private final String color;

    public HouseholdItem(String name, BigDecimal price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String fullInfo() {
        return String.format("%s, %s EUR, color: %s", name, price.setScale(2), color);
    }
}
