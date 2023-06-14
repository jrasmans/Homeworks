package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

public class PrinterTest {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("15.75");
        Printer printer = new Printer(bigDecimal);
        printer.print();

        String message = "Hello, world!";
        printer = new Printer(message);
        printer.print();
    }
}
