package io.codelex.classesandobjects.practice;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPG(Movie[] movies) {
        Movie[] pgMovies = new Movie[movies.length];
        int count = 0;

        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[count] = movie;
                count++;
            }
        }
        Movie[] result = new Movie[count];
        System.arraycopy(pgMovies, 0, result, 0, count);
        return result;
    }

    public static void main(String[] args) {
        // Creating instances of the Movie class
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG-13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG-13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        Movie[] movies = {movie1, movie2, movie3};
        Movie[] pgMovies = Movie.getPG(movies);

        for (Movie movie : pgMovies) {
            System.out.println(movie.title);
        }
    }
}

