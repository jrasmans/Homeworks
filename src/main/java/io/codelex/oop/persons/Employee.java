package io.codelex.oop.persons;

import java.time.LocalDate;

class Employee extends Person {
    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        LocalDate currentDate = LocalDate.now();
        int yearsOfWork = currentDate.getYear() - startedWorking.getYear();
        if (currentDate.getMonthValue() < startedWorking.getMonthValue()
                || (currentDate.getMonthValue() == startedWorking.getMonthValue()
                && currentDate.getDayOfMonth() < startedWorking.getDayOfMonth())) {
            yearsOfWork--;
        }
        return yearsOfWork;
    }

    @Override
    public String getInfo() {
        return position + " " + getFirstName() + " " + getLastName() + " (" + getWorkExperience() + " years)";
    }
}
