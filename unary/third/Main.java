package com.functional.unary.third;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        UnaryOperator<List<String>> unOp = a -> {
            a.replaceAll(Main::helper);
            a.removeIf(b -> b.equals(""));
            return a;
        };

        List<String> list = new ArrayList<>(List.of("Nana", "Quasar", "Kit", "Nebo", "Oracle", "Black"));
        unOp.apply(list);
        System.out.println(list);
    }

    public static String helper(String string) {
        if (string.length() < 5) {
            string = "";
        }
        return string;
    }
}
