package io.codelex.enums.practice.cardinalPoints;

public class CardinalPointsEnums {
    public enum Direction {
        NORTH("up"),
        SOUTH("down"),
        EAST("right"),
        WEST("left");

        private final String text;

        Direction(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }
}