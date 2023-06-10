package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + Math.sqrt(2) * width;
    }
}