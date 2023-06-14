package io.codelex.examination_work.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private List<T> items;
    private int currentState;

    public Basket() {
        items = new ArrayList<>();
        currentState = 0;
    }

    public void addToBasket(T item) {
        if (currentState == 10) {
            throw new BasketFullException("Basket is already full");
        }
        items.add(item);
        currentState++;
    }

    public void removeFromBasket() {
        if (currentState == 0) {
            throw new BasketEmptyException("Basket is already empty");
        }
        items.remove(items.size() - 1);
        currentState--;
    }

    public int getCurrentState() {
        return currentState;
    }

    public List<T> getItems() {
        return items;
    }
}

