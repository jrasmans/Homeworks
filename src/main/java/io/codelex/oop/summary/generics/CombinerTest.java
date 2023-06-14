package io.codelex.oop.summary.generics;

import java.math.BigDecimal;

import static io.codelex.oop.summary.generics.Combiner.combineTwoItems;

public class CombinerTest {
    public static void main(String[] args) {
        Integer integer = 15;
        BigDecimal bigDecimal = new BigDecimal("15.75");

        String combined = combineTwoItems(integer, bigDecimal);
        System.out.println(combined);
    }
}
