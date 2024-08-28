package com.takatws.utils;

import java.util.function.Consumer;

public class VBLike {
    public static <T> void with(T obj, Consumer<T> consumer) {
        consumer.accept(obj);
    }
}
