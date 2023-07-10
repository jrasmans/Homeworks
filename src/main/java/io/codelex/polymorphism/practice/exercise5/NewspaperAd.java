package io.codelex.polymorphism.practice.exercise5;

public class NewspaperAd extends Advert {
    private int columnCm;
    private int rate;

    public NewspaperAd(int fee, int columnCm, int ratePerCm) {
        super(fee);
        this.columnCm = columnCm;
        rate = ratePerCm;

    }

    public int cost() {
        return fee + rate * columnCm;
    }

    public String toString() {
        return super.toString()
                + " Newpaper ad: column_cm =" + columnCm
                + " rate=" + rate;
    }
}
