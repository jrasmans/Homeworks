package io.codelex.examination_work.filereverser;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the folder path: ");
        String folderPath = scanner.nextLine();

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        String filePath = Paths.get(folderPath, fileName).toString();
        String reversedFilePath = Paths.get(folderPath, "Reversed_" + fileName).toString();

        reverseFileContent(filePath, reversedFilePath);

        scanner.close();
    }

    private static void reverseFileContent(String filePath, String reversedFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(reversedFilePath))) {
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            content.reverse();

            writer.write(content.toString());
            System.out.println("File content reversed and saved to " + reversedFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}