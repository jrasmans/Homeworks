package io.codelex.polymorphism.practice.exercise3;

class Employee extends Person {
    private String jobTitle;

    public Employee(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Job Title: " + jobTitle);
    }
}
