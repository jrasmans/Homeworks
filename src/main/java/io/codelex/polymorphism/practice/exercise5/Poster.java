package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private int dimensions;
    private int numCopies;
    private int costPerCopy;

    public Poster(int fee, int dimensions, int numCopies, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numCopies = numCopies;
        this.costPerCopy = costPerCopy;
    }

    public int cost() {
        return super.cost() + (dimensions * numCopies * costPerCopy);
    }

    public String toString() {
        return super.toString()
                + " Poster: Dimensions=" + dimensions
                + " Number of Copies=" + numCopies
                + " Cost per Copy=" + costPerCopy;
    }
}