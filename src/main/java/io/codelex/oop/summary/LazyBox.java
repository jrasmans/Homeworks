package io.codelex.oop.summary;

import java.util.function.Supplier;

public class LazyBox<T> {
    private final Supplier<T> initializer;
    private T value;
    private boolean initialized;

    public LazyBox(Supplier<T> initializer) {
        this.initializer = initializer;
        this.initialized = false;
    }

    public T get() {
        if (!initialized) {
            value = initializer.get();
            initialized = true;
        }
        return value;
    }
}
