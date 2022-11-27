package com.functional.predicate.second;

import java.util.ArrayList;
import java.util.List;

public class RemovingLetters {
    private static char[] symbols = new char[]{'h', 'a', 't'};

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("anna", "horse", "Formula", "Formula-1", "test", "turtle"));

        list.removeIf(RemovingLetters::testSymbols);

        System.out.println(list);
        System.out.println((int) 'g');


    }

    public static boolean testSymbols(String s){
        for (char c : symbols) {
            if(s.startsWith(String.valueOf(c))){
                return true;
            }
        }
        return false;
    }
}
