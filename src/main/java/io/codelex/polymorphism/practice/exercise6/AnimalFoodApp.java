package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalFoodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        Animal animal = null;
        Food food = null;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }

            if (animal == null) {
                String[] animalInfo = input.split(" ");
                String animalType = animalInfo[0];
                String animalName = animalInfo[1];
                Double animalWeight = Double.parseDouble(animalInfo[2]);
                String livingRegion = animalInfo[3];

                if (animalType.equals("Mouse")) {
                    animal = new Mouse(animalName, animalType, animalWeight, livingRegion);
                } else if (animalType.equals("Cat")) {
                    String catBreed = animalInfo[4];
                    animal = new Cat(animalName, animalType, animalWeight, livingRegion, catBreed);
                } else if (animalType.equals("Tiger")) {
                    animal = new Tiger(animalName, animalType, animalWeight, livingRegion);
                }

                animals.add(animal);
                System.out.println(animal.toString());
                animal.makeSound();
            } else {
                String[] foodInfo = input.split(" ");
                String foodType = foodInfo[0];
                Integer quantity = Integer.parseInt(foodInfo[1]);

                if (foodType.equals("Vegetable")) {
                    food = new Vegetable(quantity);
                } else if (foodType.equals("Meat")) {
                    food = new Meat(quantity);
                }

                animal.eat(food);

                System.out.print("> ");
            }
        }

        System.out.print("> ");
        for (int i = 0; i < animals.size(); i++) {
            Animal currentAnimal = animals.get(i);
            System.out.print(currentAnimal.toString());
            if (i != animals.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}

