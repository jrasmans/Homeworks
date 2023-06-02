package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {

    private List<Video> videos;

    public VideoStore() {
        videos = new ArrayList<>();
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public void checkOut(String title) {
        for (Video v : videos) {
            if (v.getTitle().equals(title)) {
                v.checkOut();
            }
        }
    }

    public void returnVideo(String title) {
        for (Video v : videos) {
            if (v.getTitle().equals(title)) {
                v.returnVideo();
            }
        }
    }

    public void receiveRating(String title, int rating) {
        for (Video v : videos) {
            if (v.getTitle().equals(title)) {
                v.receiveRating(rating);
            }
        }
    }

    public void printOutInventory() {
        for (Video v : videos) {
            System.out.println(v);
        }
    }
}
