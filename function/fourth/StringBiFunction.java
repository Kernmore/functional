package com.functional.function.fourth;

import java.util.Arrays;
import java.util.function.BiFunction;

public class StringBiFunction {
    public static void main(String[] args) {
        String one = "Hello Java + Python 123 + C";
        String two = "Goodbye Java and Python & C";

        BiFunction<String, String, String[]> biFunction = StringBiFunction::findWords;
        System.out.println(Arrays.toString(biFunction.apply(one, two)));
    }

    public static String[] findWords(String one, String two) {
        StringBuilder sb = new StringBuilder();
        String[] firstString = one.split(" ");
        String[] secondString = two.split(" ");
        for (int i = 0; i < firstString.length; i++) {
            if (isSimilar(firstString[i], secondString)) {
                sb.append(firstString[i] + " ");
            }
        }
        return sb.toString().split(" ");
    }

    public static boolean isSimilar(String s, String[] t) {
        for (int i = 0; i < t.length; i++) {
            if (s.equals(t[i])) {
                return true;
            }
        }
        return false;
    }
}
