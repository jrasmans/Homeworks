package io.codelex.oop.summary.ordersandinvoices;

import java.math.BigDecimal;

class ElectronicsItem extends AbstractItem {
    private final int power;

    public ElectronicsItem(String name, BigDecimal price, int power) {
        super(name, price);
        this.power = power;
    }

    @Override
    public String fullInfo() {
        return String.format("%s, %s EUR, power: %dW", name, price.setScale(2), power);
    }
}
