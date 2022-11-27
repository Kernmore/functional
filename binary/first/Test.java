package com.functional.binary.first;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Test {
    public static void main(String[] args) {
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        BinaryOperator<String> binaryOperator = BinaryOperator.maxBy(comparator);

        System.out.println(binaryOperator.apply("Hello", "Rock"));
    }


}
