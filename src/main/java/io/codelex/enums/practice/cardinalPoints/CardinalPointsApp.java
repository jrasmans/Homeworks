package io.codelex.enums.practice.cardinalPoints;

import java.util.EnumMap;

import static io.codelex.enums.practice.cardinalPoints.CardinalPointsEnums.Direction;

public class CardinalPointsApp {
    public static void main(String[] args) {
        System.out.println("Using if statement:");
        for (Direction dir : Direction.values()) {
            System.out.println(dir + ":" + dir.getText() + ":" + dir.ordinal());
        }
        System.out.println();

        System.out.println("Using switch statement:");
        for (Direction dir : Direction.values()) {
            System.out.println(dir + ":" + dir.getText() + ":" + dir.ordinal());
        }
        System.out.println();

        System.out.println("Using a field inside enum:");
        for (Direction dir : Direction.values()) {
            System.out.println(dir + ":" + dir.getText() + ":" + dir.ordinal());
        }
        System.out.println();

        Direction direction = Direction.WEST;
        System.out.println("Using abstract method:");
        for (Direction dir : Direction.values()) {
            System.out.println(dir + ":" + dir.getText() + ":" + dir.ordinal());
        }
        System.out.println();

        EnumMap<Direction, String> directionMap = new EnumMap<>(Direction.class);
        directionMap.put(Direction.NORTH, Direction.NORTH.getText());
        directionMap.put(Direction.SOUTH, Direction.SOUTH.getText());
        directionMap.put(Direction.EAST, Direction.EAST.getText());
        directionMap.put(Direction.WEST, Direction.WEST.getText());
        System.out.println("Using EnumMap:");
        for (Direction dir : Direction.values()) {
            System.out.println(dir + ":" + dir.getText() + ":" + dir.ordinal());
        }
    }
}