package com.functional.comparator.fourth;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(47, 4, 8, 9, 301, 3, 2, 18, 15, 18, 1));

        Comparator<Integer> comp = Integer::compare;
        List<Integer> primeNumbers = givePrimeList(list);
        int number = 0;
        if (primeNumbers.isEmpty()) {
            number = Collections.min(list, comp);
        } else {
            number = Collections.max(primeNumbers, comp);
        }
        System.out.println(number);
    }

    private static List<Integer> givePrimeList(List<Integer> list) {
        Predicate<Integer> pr = a -> {
            BigInteger big = BigInteger.valueOf(a);
            return big.isProbablePrime((int) Math.log(a));
        };

        List<Integer> primeNumbers = new ArrayList<>();
        for (var v : list) {
            if (pr.test(v)) {
                primeNumbers.add(v);
            }
        }
        return primeNumbers;
    }
}
