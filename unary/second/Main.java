package com.functional.unary.second;

import java.util.function.UnaryOperator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<String> unOp = a -> {
            Pattern pattern = Pattern.compile("\\d");
            Matcher matcher = pattern.matcher(a);
            StringBuilder result = new StringBuilder();
            for( ; matcher.find() ; ) {
                result.append(matcher.group());
            }
            return result.toString();
        };

        String string = "Hello 223 world 54";
        System.out.println(unOp.apply(string));


    }
}
