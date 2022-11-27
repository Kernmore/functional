package com.functional.comparable.third;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Lus", 5);
        Cat cat3 = new Cat("Barsics", 8);
        Cat cat4 = new Cat("Timkas", 5);
        Cat cat5 = new Cat("Kuzia", 2);

        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };
        System.out.println(Arrays.toString(cats));

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));



    }
}
