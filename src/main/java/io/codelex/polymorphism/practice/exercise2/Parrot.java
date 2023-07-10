package io.codelex.polymorphism.practice.exercise2;

class Parrot implements Sound {
    private String sound;

    public Parrot(String sound) {
        this.sound = sound;
    }

    public void playSound() {
        System.out.println(sound);
    }
}