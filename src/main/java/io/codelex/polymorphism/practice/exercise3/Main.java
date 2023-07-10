package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(3.8);
        student.setFirstName("John");
        student.setLastName("Lennon");
        student.setAddress("123 Main Street");
        student.setId(1001);

        Employee employee = new Employee("Manager");
        employee.setFirstName("Jane");
        employee.setLastName("Smith");
        employee.setAddress("456 Secondary Street");
        employee.setId(2001);

        System.out.println("Student Information:");
        student.display();

        System.out.println("\nEmployee Information:");
        employee.display();
    }
}

