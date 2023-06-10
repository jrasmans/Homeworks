package io.codelex.oop.shape;

class Hexagon extends Shape {
    private double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return 6 * side;
    }

    @Override
    double calculateArea() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }
}
