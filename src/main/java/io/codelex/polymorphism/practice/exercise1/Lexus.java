package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Boostable {
    private Integer currentSpeed = 0;

    @Override
    public void speedUp() {
        currentSpeed += 8;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 8;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useBoost() {
        currentSpeed += 30;
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
