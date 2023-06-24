package io.codelex.oop.summary.ordersandinvoices;

import java.math.BigDecimal;

interface SellableThing {
    String getName();

    BigDecimal getPrice();

    String fullInfo();
}

