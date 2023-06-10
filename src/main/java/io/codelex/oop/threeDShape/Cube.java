package io.codelex.oop.threeDShape;

class Cube extends ThreeDShape {
    private double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return 6 * sideLength * sideLength;
    }

    @Override
    public double calculateVolume() {
        return sideLength * sideLength * sideLength;
    }
}
