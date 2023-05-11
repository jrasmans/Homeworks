package io.codelex.arithmetic.practice;

public class Exercise_8 {
    public static void main(double basePay, int hoursWorked) {
        if (basePay < 8.0) {
            System.out.println("Error: Base pay cannot be less than $8.00 an hour");
            return;
        }
        if (hoursWorked > 60) {
            System.out.println("Error: Hours worked cannot be more than 60 hours in a week");
            return;
        }
        double totalPay;
        if (hoursWorked <= 40) {
            totalPay = basePay * hoursWorked;
        } else {
            int overtimeHours = hoursWorked - 40;
            double overtimePay = basePay * 1.5;
            totalPay = basePay * 40 + overtimePay * overtimeHours;
        }
        System.out.println("Total pay: $" + totalPay);
    }

    public static void main(String[] args) {
        main(7.5, 35);
        main(8.2, 47);
        main(10.0, 73);
    }
}

