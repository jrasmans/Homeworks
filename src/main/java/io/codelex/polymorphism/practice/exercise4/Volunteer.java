package io.codelex.polymorphism.practice.exercise4;

import java.math.BigDecimal;

public class Volunteer extends StaffMember {
    public Volunteer(String eName, String eAddress, String ePhone) {
        super(eName, eAddress, ePhone);
    }

    public BigDecimal pay() {
        return BigDecimal.ZERO;
    }
} 