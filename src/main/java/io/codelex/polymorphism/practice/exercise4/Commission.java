package io.codelex.polymorphism.practice.exercise4;

import java.math.BigDecimal;

public class Commission extends Hourly {
    private BigDecimal totalSales;
    private BigDecimal commissionRate;

    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, BigDecimal rate, BigDecimal commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        totalSales = BigDecimal.valueOf(0);
        this.commissionRate = commissionRate;
    }

    public void addSales(BigDecimal totalSales) {
        this.totalSales = this.totalSales.add(totalSales);
    }

    public BigDecimal pay() {
        BigDecimal hourlyPay = super.pay();
        BigDecimal commissionPay = totalSales.multiply(commissionRate);
        BigDecimal payment = hourlyPay.add(commissionPay);
        totalSales = BigDecimal.ZERO;
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal Sales: $" + totalSales;
        return result;
    }
}