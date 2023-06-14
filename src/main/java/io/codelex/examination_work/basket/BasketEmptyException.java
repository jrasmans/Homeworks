package io.codelex.examination_work.basket;

public class BasketEmptyException extends RuntimeException {
    public BasketEmptyException(String message) {
        super(message);
    }
}
