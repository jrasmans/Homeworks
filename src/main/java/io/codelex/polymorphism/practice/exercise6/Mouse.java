package io.codelex.polymorphism.practice.exercise6;

class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            foodEaten += food.getQuantity();
        } else {
            System.out.println(animalType + " are not eating that type of food!");
        }
    }
}
