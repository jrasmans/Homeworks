package io.codelex.enums.practice.rockPaperScissors;

import java.util.Random;

public enum RockPaperScissors {
    ROCK("SCISSORS", "breaks"),
    PAPER("ROCK", "wraps"),
    SCISSORS("PAPER", "cuts");

    private final String isStrongerThan;
    private final String function;

    RockPaperScissors(String isStrongerThan, String function) {
        this.isStrongerThan = isStrongerThan;
        this.function = function;
    }

    public static RockPaperScissors randomPattern() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public static RockPaperScissors userPattern(String userInput) {
        return switch (userInput) {
            case "s" -> SCISSORS;
            case "p" -> PAPER;
            case "r" -> ROCK;
            default -> null;
        };
    }

    public boolean isStrongerThan(RockPaperScissors other) {
        return this.isStrongerThan.equals(other.name());
    }

    public boolean isWeakerThan(RockPaperScissors other) {
        return !isStrongerThan(other) && !this.equals(other);
    }

    public String getFunction() {
        return function;
    }
}

    