package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(0, 240),
    INTERMEDIATE(241, 180),
    ADVANCED(361, Integer.MAX_VALUE);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time) {
        for (Runner runner : Runner.values()) {
            if (time >= runner.minTime && time <= runner.maxTime) {
                return runner;
            }
        }
        return null;
    }
}


