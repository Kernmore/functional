package com.functional.consumer.first;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        Consumer<Integer> consumer = a -> {
            if (a % 2 != 0) {
                System.out.println(a);
            }
        };
        List<Integer> list = new ArrayList<>(List.of(4, 5, 6, 7, 8, 8, 90, 11, 345));

        list.forEach(consumer);
    }
}
