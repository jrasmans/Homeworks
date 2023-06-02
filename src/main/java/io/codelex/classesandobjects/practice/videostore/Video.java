package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private final String title;
    private boolean isCheckedOut;
    private int ratingCount;
    private int totalRating;

    //Have to improve code below to   submit method ratingu down here
    public Video(String title) {
        this.title = title;
        this.isCheckedOut = false;
        this.ratingCount = 0;
        this.totalRating = 0;
    }

    public void checkOut() {
        this.isCheckedOut = true;
    }

    public void returnVideo() {
        this.isCheckedOut = false;
    }

    public void receiveRating(int rating) {
        this.ratingCount++;
        this.totalRating += rating;
    }

    public double getAverageRating() {
        if (ratingCount == 0)
            return 0;
        return (double) totalRating / (double) ratingCount;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", averageRating=" + getAverageRating() +
                '}';
    }
}
