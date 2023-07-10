package io.codelex.polymorphism.practice.exercise4;

import java.math.BigDecimal;

public class Hourly extends Employee {
    private int hoursWorked;

    public Hourly(String eName, String eAddress, String ePhone,
                  String socSecNumber, BigDecimal rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        hoursWorked = 0;
    }

    public void addHours(int moreHours) {
        hoursWorked += moreHours;
    }

    public BigDecimal pay() {
        BigDecimal payment = payRate.multiply(BigDecimal.valueOf(hoursWorked));
        hoursWorked = 0;
        return payment;
    }

    public String toString() {
        String result = super.toString();
        result += "\nCurrent hours: " + hoursWorked;
        return result;
    }
} 