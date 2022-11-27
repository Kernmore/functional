package com.functional.function.third;

import java.util.function.Function;

public class SymbolsSum {
    public static void main(String[] args) {
        String string = "Let's find the number of symbols";

        Function<String, Character[]> fun1 = a -> {
            a = a.trim();
            char[] chars = a.toCharArray();
            return convertCharArray(chars);
        };

        Function<Character[], Integer> fun2 = a -> a.length;

        Function<String, Integer> fun3 = fun1.andThen(fun2);
        System.out.println(fun3.apply(string));
    }

    public static Character[] convertCharArray(char[] chars){
        Character[] array = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            array[i] = chars[i];
        }
        return array;
    }
}
