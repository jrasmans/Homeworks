package io.codelex.oop.parcels;

public class ParcelValidatorTest {
    public static void main(String[] args) {
        Parcel validParcel = new Parcel(100, 100, 100, 20.0f, false);
        Parcel invalidDimensionsParcel = new Parcel(10, 100, 100, 20.0f, false);
        Parcel invalidWeightParcel = new Parcel(100, 100, 100, 35.0f, true);
        Parcel invalidExpressParcel = new Parcel(100, 100, 100, 10.0f, true);

        System.out.println("Valid parcel: " + validParcel.validate());
        System.out.println("Invalid dimensions parcel: " + invalidDimensionsParcel.validate());
        System.out.println("Invalid weight parcel: " + invalidWeightParcel.validate());
        System.out.println("Invalid express parcel: " + invalidExpressParcel.validate());
    }
}
