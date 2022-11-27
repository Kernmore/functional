package com.functional.supplier.second;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        /**
         * return the string values where the last character is Uppercase
         */
        List<String> list = new ArrayList<>(List.of("Name", "RocK", "oriON", "Claim", "DarK"));
        Predicate<String> pr = a -> Character.isUpperCase(a.charAt(a.length() - 1));
        Iterator<String> i = list.iterator();
        Supplier<String> sup = () -> {
            for (; i.hasNext(); ) {
                String temp = i.next();
                if (pr.test(temp)) {
                    return temp;
                }
            }
            return null;
        };
        String string;
        for (; (string = sup.get()) != null ; ) {
            System.out.println(string);
        }
    }
}
