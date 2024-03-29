package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    private static VideoStore store = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        Video firstMovie = new Video("The Matrix");
        Video secondMovie = new Video("Godfather II");
        Video thirdMovie = new Video("Star Wars Episode IV: A New Hope");

        store.addVideo(firstMovie);
        store.addVideo(secondMovie);
        store.addVideo(thirdMovie);

        store.receiveRating("The Matrix", 10);
        store.receiveRating("The Matrix", 4);

        store.receiveRating("Star Wars Episode IV: A New Hope", 8);
        store.receiveRating("Star Wars Episode IV: A New Hope", 9);


        store.checkOut("the Matrix");
        store.checkOut("the Gogfather II");

        store.printOutInventory();

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            Video video = new Video(movieName);
            video.receiveRating(rating);
            store.addVideo(video);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter the title of the video to return:");
        String title = scanner.next();
        store.checkOut(title);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter the title of the video to return:");
        String title = scanner.next();
        store.returnVideo(title);
    }
}
