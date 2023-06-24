package io.codelex.oop.summary.ordersandinvoices;

import java.math.BigDecimal;

class ItemPacking implements Service {
    private static final String NAME = "Item packing";
    private static final BigDecimal PRICE = new BigDecimal("5.00");

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }

    @Override
    public String fullInfo() {
        return getName() + ", " + getPrice().setScale(2) + " EUR";
    }
}
