package io.codelex.oop.shape;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(3, 4, 5);
        Hexagon hexagon = new Hexagon(6);

        System.out.println("Rectangle Perimeter: " + String.format("%.2f", rectangle.calculatePerimeter()));
        System.out.println("Rectangle Area: " + String.format("%.2f", rectangle.calculateArea()));

        System.out.println("Triangle Perimeter: " + String.format("%.2f", triangle.calculatePerimeter()));
        System.out.println("Triangle Area: " + String.format("%.2f", triangle.calculateArea()));

        System.out.println("Hexagon Perimeter: " + String.format("%.2f", hexagon.calculatePerimeter()));
        System.out.println("Hexagon Area: " + String.format("%.2f", hexagon.calculateArea()));
    }
}