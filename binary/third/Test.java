package com.functional.binary.third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

public class Test<T extends Comparable> {
    private BinaryOperator<List<T>> listBinaryOperator = (a, b) -> {
        T one = (T) Collections.min(a);
        T two = (T) Collections.min(b);
        if (one.compareTo(two) < 0) {
            return a;
        } else if (one.compareTo(two) > 0) {
            return b;
        } else {
            return new ArrayList<T>();
        }
    };



    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(List.of(-4,5,6,2,99,221,5445,7));
        List<Integer> l2 = new ArrayList<>(List.of(3,5,7,1,99,222,-3,7));

        Test<Integer> test1 = new Test<>();
        System.out.println(test1.listBinaryOperator.apply(l1, l2));

        List<String> s1 = new ArrayList<>(List.of("Hello", "Nana", "Okay", "Kit"));
        List<String> s2 = new ArrayList<>(List.of("Komp", "Tor", "Io", "Amadeus"));

        Test<String> test2 = new Test<>();
        System.out.println(test2.listBinaryOperator.apply(s1, s2));

    }



}
