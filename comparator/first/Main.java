package com.functional.comparator.first;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Umka", 12);
        Cat cat2 = new Cat("Luskas", 5);
        Cat cat3 = new Cat("Barsics", 8);
        Cat cat4 = new Cat("Timka", 5);
        Cat cat5 = new Cat("Kuz", 2);
        Cat[] cats = new Cat[] { cat1, cat2, cat3, cat4, cat5 };

        for (var c : cats) {
            System.out.println(c);
        }

        Comparator<Cat> comp = Comparator.comparingInt(a -> a.getName().length());
        System.out.println();
        Arrays.sort(cats, comp);
        for (var c : cats) {
            System.out.println(c);
        }

    }


}
