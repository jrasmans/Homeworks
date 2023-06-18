package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        displayHistogram(scores);
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line).append(" ");
        }
        return sb.toString().trim();
    }

    private static void displayHistogram(String scores) {
        int[] frequency = new int[11];

        String[] scoreArray = scores.split(" ");

        for (String score : scoreArray) {
            int value = Integer.parseInt(score.trim());
            if (value <= 100) {
                frequency[value / 10]++;
            }
        }

        for (int i = 0; i < frequency.length - 1; i++) {
            String range = String.format("%02d-%02d", i * 10, i * 10 + 9);
            String histogram = "*".repeat(frequency[i]);
            System.out.println(range + ": " + histogram);
        }

        String range = "100";
        String histogram = "*".repeat(frequency[frequency.length - 1]);
        System.out.println(range + ": " + histogram);
    }
}
