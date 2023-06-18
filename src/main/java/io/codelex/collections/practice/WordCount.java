package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(WordCount.class.getResource(file).toURI());
        countWordsLinesChars(path);
    }

    private static void countWordsLinesChars(Path path) throws IOException {
        int lines = 0;
        int words = 0;
        int chars = 0;

        for (String line : Files.readAllLines(path, charset)) {
            lines++;
            chars += line.length();
            String[] lineWords = line.split("\\s+");
            for (String word : lineWords) {
                if (!word.isEmpty()) {
                    words++;
                }
            }
        }

        System.out.println("Lines = " + lines);
        System.out.println("Words = " + words);
        System.out.println("Chars = " + chars);
    }
}