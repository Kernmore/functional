package com.functional.function.second;

import java.util.function.Function;

public class CountConsonant {
    public static void main(String[] args) {
        String string = "Java rocks";
        Function<String, Integer> function = a -> {
            char[] chars = a.toCharArray();
            int count = 0;
            for (int i = 0; i < chars.length; i++) {
                if (Consonant.isConsonant(chars[i])) {
                    count++;
                }
            }
            return count;
        };
        System.out.println(function.apply(string));

    }
}
