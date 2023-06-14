package io.codelex.examination_work.joiner;

import java.util.ArrayList;
import java.util.List;

public class Joiner<T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... elements) {
        List<String> strings = new ArrayList<>();
        for (T element : elements) {
            strings.add(element.toString());
        }
        return String.join(separator, strings);
    }
}


