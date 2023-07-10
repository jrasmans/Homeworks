package io.codelex.polymorphism.practice.exercise4;

import java.math.BigDecimal;

public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected BigDecimal payRate;

    public BigDecimal pay() {
        return payRate;
    }

    public Employee(String eName, String eAddress, String ePhone,
                    String socSecNumber, BigDecimal rate) {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    public String toString() {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }
} 