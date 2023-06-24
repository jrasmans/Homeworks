package io.codelex.oop.summary.ordersandinvoices;

import java.util.ArrayList;
import java.util.List;

class Order {
    private final List<SellableThing> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(SellableThing item) {
        items.add(item);
    }

    public List<SellableThing> getItems() {
        return items;
    }
}
