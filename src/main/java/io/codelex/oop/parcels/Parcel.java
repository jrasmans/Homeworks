package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        int sumOfDimensions = xLength + yLength + zLength;
        boolean isValid = true;

        if (sumOfDimensions > 300) {
            System.out.println("Sum of dimensions exceeds 300.");
            isValid = false;
        }

        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Dimensions should not be less than 30.");
            isValid = false;
        }

        if (isExpress && weight > 15.0) {
            System.out.println("Weight exceeds 15.0 for express parcel.");
            isValid = false;
        }

        if (!isExpress && weight > 30.0) {
            System.out.println("Weight exceeds 30.0 for non-express parcel.");
            isValid = false;
        }

        return isValid;
    }
}
