package io.codelex.polymorphism.practice.exercise4;

import java.math.BigDecimal;

public class Executive extends Employee {
    private BigDecimal bonus;

    public void awardBonus(BigDecimal execBonus) {
        bonus = execBonus;
    }

    public BigDecimal pay() {
        BigDecimal payment = super.pay().add(bonus);
        bonus = BigDecimal.ZERO;
        return payment;
    }

    public Executive(String eName, String eAddress, String ePhone,
                     String socSecNumber, BigDecimal rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = BigDecimal.valueOf(0);
    }
} 