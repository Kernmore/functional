package com.functional.comparator.third;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(62, 2000, 306, 55));
        Comparator<Integer> comparator = Test::compareBySpecificDigits;

        list.sort(comparator);
        System.out.println(list);
    }


    public static int compareBySpecificDigits(Integer a, Integer b) {
        char[] first = String.valueOf(a).toCharArray();
        char[] second = String.valueOf(b).toCharArray();
        return (first[0] + first[first.length - 1]) - (second[0] + second[second.length - 1]);
    }
}
