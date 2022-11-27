package com.functional.predicate.fourth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiPredicate;


public class BiPredicates {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(Map.of( 3 , "Java", 4, "Hello", 5, "World"));

        BiPredicate<Integer, String> predicate = (a, b) -> a == b.length();

        Iterator<Integer> i = map.keySet().iterator();
        for ( ; i.hasNext(); ) {
            Integer k = i.next();
            if (predicate.negate().test(k, map.get(k))){
                i.remove();
            }
        }
        System.out.println(map);
    }
}
