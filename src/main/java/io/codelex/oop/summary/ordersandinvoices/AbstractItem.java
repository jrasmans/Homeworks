package io.codelex.oop.summary.ordersandinvoices;

import java.math.BigDecimal;

abstract class AbstractItem implements Item {
    protected String name;
    protected BigDecimal price;

    public AbstractItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    public abstract String fullInfo();
}
