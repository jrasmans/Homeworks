package io.codelex.examination_work.basket;

public class Main {
    public static void main(String[] args) {
        Basket<Apple> appleBasket = new Basket<>();

        try {
            for (int i = 0; i < 10; i++) {
                appleBasket.addToBasket(new Apple());
                System.out.println("Added an apple to the basket. Current items: " + appleBasket.getItems());
            }
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i < 10; i++) {
                appleBasket.removeFromBasket();
                System.out.println("Removed an apple from the basket. Current items: " + appleBasket.getItems());
            }
        } catch (BasketEmptyException e) {
            System.out.println(e.getMessage());
        }

        Basket<Mushroom> mushroomBasket = new Basket<>();

        try {
            for (int i = 0; i < 10; i++) {
                mushroomBasket.addToBasket(new Mushroom());
                System.out.println("Added a mushroom to the basket. Current items: " + mushroomBasket.getItems());
            }
        } catch (BasketFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i < 10; i++) {
                mushroomBasket.removeFromBasket();
                System.out.println("Removed a mushroom from the basket. Current items: " + mushroomBasket.getItems());
            }
        } catch (BasketEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}