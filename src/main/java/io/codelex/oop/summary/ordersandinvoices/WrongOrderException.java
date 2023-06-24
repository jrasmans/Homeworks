package io.codelex.oop.summary.ordersandinvoices;

class WrongOrderException extends RuntimeException {
    public WrongOrderException(String message) {
        super(message);
    }
}