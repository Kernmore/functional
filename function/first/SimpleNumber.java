package com.functional.function.first;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.function.Predicate;

public class SimpleNumber {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{5, 6, 7, 8, 9, 10, 2};

        Predicate<Integer> pr = a -> {
            BigInteger big = BigInteger.valueOf(a);
            return big.isProbablePrime((int) Math.log(a));
        };

        Function<Integer[], Integer> function = a -> {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (pr.test(a[i])) {
                    count++;
                }
            }
            return count;
        };
        System.out.println(function.apply(array));
    }

}
