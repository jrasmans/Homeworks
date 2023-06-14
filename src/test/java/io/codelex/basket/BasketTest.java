package io.codelex.basket;

import io.codelex.examination_work.basket.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    void testAddToBasket() {
        Basket<Apple> appleBasket = new Basket<>();
        Assertions.assertEquals(0, appleBasket.getCurrentState());

        for (int i = 1; i <= 10; i++) {
            appleBasket.addToBasket(new Apple());
            Assertions.assertEquals(i, appleBasket.getCurrentState());
        }

        Assertions.assertThrows(BasketFullException.class, () -> appleBasket.addToBasket(new Apple()));
    }

    @Test
    void testRemoveFromBasket() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        Assertions.assertEquals(0, mushroomBasket.getCurrentState());

        Assertions.assertThrows(BasketEmptyException.class, () -> mushroomBasket.removeFromBasket());

        for (int i = 1; i <= 5; i++) {
            mushroomBasket.addToBasket(new Mushroom());
        }

        for (int i = 5; i >= 1; i--) {
            mushroomBasket.removeFromBasket();
            Assertions.assertEquals(i - 1, mushroomBasket.getCurrentState());
        }

        Assertions.assertThrows(BasketEmptyException.class, () -> mushroomBasket.removeFromBasket());
    }
}
