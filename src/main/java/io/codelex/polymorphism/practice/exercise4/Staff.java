package io.codelex.polymorphism.practice.exercise4;

import java.math.BigDecimal;

public class Staff {
    StaffMember[] staffList;

    public Staff() {
        staffList = new StaffMember[8];
        staffList[0] = new Executive("Sam", "123 Main Line", "555-0469", "123-45-6789", new BigDecimal("2423.07"));
        staffList[1] = new Employee("Carla", "456 Off Line", "555-0101", "987-65-4321", new BigDecimal("1246.15"));
        staffList[2] = new Employee("Woody", "789 Off Rocker", "555-0000", "010-20-3040", new BigDecimal("1169.23"));
        staffList[3] = new Hourly("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", new BigDecimal("10.55"));
        staffList[4] = new Volunteer("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer("Cliff", "321 Duds Lane", "555-7282");
        staffList[6] = new Commission("John", "456 Elm Street", "555-1234", "456-78-9012", new BigDecimal("6.25"), new BigDecimal("0.2"));
        staffList[7] = new Commission("Jane", "789 Oak Avenue", "555-5678", "901-23-4567", new BigDecimal("9.75"), new BigDecimal("0.15"));

        ((Executive) staffList[0]).awardBonus(new BigDecimal("500.00"));
        ((Hourly) staffList[3]).addHours(40);
        ((Commission) staffList[6]).addHours(35);
        ((Commission) staffList[6]).addSales(new BigDecimal("400"));
        ((Commission) staffList[7]).addHours(40);
        ((Commission) staffList[7]).addSales(new BigDecimal("950"));
    }

    public void payday() {
        for (StaffMember staffMember : staffList) {
            System.out.println(staffMember);
            BigDecimal amount = staffMember.pay();
            if (amount.equals(BigDecimal.ZERO))
                System.out.println("Thanks!");
            else
                System.out.println("Paid: $" + amount);
            System.out.println("-----------------------------------");
        }
    }
}