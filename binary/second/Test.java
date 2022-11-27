package com.functional.binary.second;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Test {
    public static void main(String[] args) {
        BinaryOperator<List<Integer>> binaryOperator = (a, b) -> {
            List<Integer> result = new ArrayList<>();
            for (var v : a) {
                if (b.contains(v)) {
                    result.add(v);
                }
            }
            return result;
        };

        List<Integer> l1 = new ArrayList<>(List.of(4,5,6,2,99,221,5445,7));
        List<Integer> l2 = new ArrayList<>(List.of(3,5,7,1,99,222,5445,7));

        System.out.println(binaryOperator.apply(l1, l2));

    }
}
