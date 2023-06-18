package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Map<String, List<String>> flightData = loadFlightData();
        List<String> cities = new ArrayList<>(flightData.keySet());

        Scanner scanner = new Scanner(System.in);
        String input;
        boolean exit = false;

        System.out.println("What would you like to do?");
        System.out.println("To display list of the cities press 1");
        System.out.println("To exit the program press #");

        while (!exit) {
            System.out.print("> ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    displayCities(cities);
                    break;
                case "#":
                    exit = true;
                    break;
                default:
                    if (cities.contains(input)) {
                        planFlightRoute(flightData, input);
                        exit = true;
                    } else {
                        System.out.println("Invalid input. Please try again.");
                    }
            }
        }
        scanner.close();
    }

    private static Map<String, List<String>> loadFlightData() throws IOException, URISyntaxException {
        final Path path = Paths.get(FlightPlanner.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);

        Map<String, List<String>> flightData = new HashMap<>();

        for (String line : lines) {
            line = line.trim();

            if (!line.isEmpty()) {
                String[] cities = line.split("->");

                if (cities.length == 2) {
                    String origin = cities[0].trim();
                    String destination = cities[1].trim();

                    flightData.putIfAbsent(origin, new ArrayList<>());
                    flightData.get(origin).add(destination);
                }
            }
        }

        return flightData;
    }

    private static void displayCities(List<String> cities) {
        System.out.println("Available cities:");
        for (String city : cities) {
            System.out.println(city);
        }
    }

    private static void planFlightRoute(Map<String, List<String>> flightData, String startCity) {
        List<String> route = new ArrayList<>();
        String currentCity = startCity;

        while (true) {
            route.add(currentCity);

            List<String> destinations = flightData.get(currentCity);
            if (destinations == null || destinations.isEmpty()) {
                break;
            }

            System.out.println("From " + currentCity + ", you can fly directly to:");
            for (String destination : destinations) {
                System.out.println(destination);
            }

            System.out.println("Choose your next city:");
            Scanner scanner = new Scanner(System.in);
            System.out.print("> ");
            currentCity = scanner.nextLine();

            if (currentCity.equals(startCity)) {
                route.add(currentCity);
                break;
            }
        }
        System.out.println("Your flight route:");
        for (String city : route) {
            System.out.println(city);
        }
    }
}
