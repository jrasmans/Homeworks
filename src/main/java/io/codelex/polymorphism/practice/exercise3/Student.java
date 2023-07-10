package io.codelex.polymorphism.practice.exercise3;

class Student extends Person {
    private double gpa;

    public Student(double gpa) {
        this.gpa = gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("GPA: " + gpa);
    }
}
