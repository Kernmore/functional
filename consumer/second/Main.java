package com.functional.consumer.second;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Consumer<String> cons = a -> {
            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(a);
            if(matcher.find()){
                list.add(a);
            }
        };

        cons.accept("Hello");
        cons.accept("Java3");
        cons.accept("Cigarette");
        cons.accept("56Rubikon");
        cons.accept("54_34Ll");
        System.out.println(list);
    }

}
