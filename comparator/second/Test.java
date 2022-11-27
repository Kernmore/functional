package com.functional.comparator.second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(2, 4, 4, 6, 3, -2));
        Comparator<Integer> comp = Comparator.comparingInt(Math::abs);
        Comparator<Integer> comp1 = comp.thenComparing((a, b) -> b - a);

        System.out.println(Collections.min(list, comp1));
    }
}
