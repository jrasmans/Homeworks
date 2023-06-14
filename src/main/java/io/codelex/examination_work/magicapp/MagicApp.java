package io.codelex.examination_work.magicapp;

import java.util.List;
import java.util.function.Predicate;

public class MagicApp {

    public static <T> double partOf(List<T> list, Predicate<T> condition) {
        long count = list.stream().filter(condition).count();
        return (double) count / list.size();
    }
}