package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = createShape(Rectangle::new, 5, 10);
        Shape triangle = createShape(Triangle::new, 8, 6);

        System.out.println("Rectangle:");
        System.out.println("Num Sides: " + rectangle.getNumSides());
        System.out.println("Width: " + String.format("%.2f", ((Rectangle) rectangle).getWidth()));
        System.out.println("Height: " + String.format("%.2f", ((Rectangle) rectangle).getHeight()));
        System.out.println("Area: " + String.format("%.2f", rectangle.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", rectangle.getPerimeter()));
        System.out.println("Triangle:");
        System.out.println("Num Sides: " + triangle.getNumSides());
        System.out.println("Width: " + String.format("%.2f", ((Triangle) triangle).getWidth()));
        System.out.println("Height: " + String.format("%.2f", ((Triangle) triangle).getHeight()));
        System.out.println("Area: " + String.format("%.2f", triangle.getArea()));
        System.out.println("Perimeter: " + String.format("%.2f", triangle.getPerimeter()));
    }

    public static Shape createShape(ShapeCreator shapeCreator, double width, double height) {
        return shapeCreator.create(width, height);
    }

    interface ShapeCreator {
        Shape create(double width, double height);
    }
}

