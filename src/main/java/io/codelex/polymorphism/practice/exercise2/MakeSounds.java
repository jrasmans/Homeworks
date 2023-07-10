package io.codelex.polymorphism.practice.exercise2;

import java.util.List;
import java.util.ArrayList;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Sound> soundObjects = new ArrayList<>();

        soundObjects.add(new Firework());
        soundObjects.add(new Parrot("Polly wants a cracker!"));
        soundObjects.add(new Radio("Playing your favorite tunes!"));

        for (Sound soundObject : soundObjects) {
            soundObject.playSound();
        }
    }
}

