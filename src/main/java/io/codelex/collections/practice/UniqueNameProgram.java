package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNameProgram {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter names (one per line). Press Enter to stop.");
        String input;
        while (true) {
            System.out.print("Enter name: ");
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            uniqueNames.add(input);
        }
        System.out.print("Unique name list contains: ");
        for (String name : uniqueNames) {
            System.out.print(name + " ");
        }
    }
}
