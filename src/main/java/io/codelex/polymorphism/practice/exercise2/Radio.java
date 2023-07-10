package io.codelex.polymorphism.practice.exercise2;

class Radio implements Sound {
    private String sound;

    public Radio(String sound) {
        this.sound = sound;
    }

    public void playSound() {
        System.out.println(sound);
    }
}