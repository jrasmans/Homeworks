package io.codelex.exceptions.practice.exercise4;

public class NonPositiveNumberException extends Exception {
    public NonPositiveNumberException() {
        super("Input should be a positive number.");
    }
}