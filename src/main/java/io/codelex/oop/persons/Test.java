package io.codelex.oop.persons;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Brown", "EMP123", 35, "Accountant", LocalDate.of(2016, 1, 1));
        System.out.println(employee.getInfo());

        Customer customer = new Customer("Peter", "Brown", "CID1234", 42, "Customer123", 10);
        System.out.println(customer.getInfo());
    }
}
