package com.functional.unary.first;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Test {
    public static void main(String[] args) {
        UnaryOperator<Integer> unOp = a -> {
            if(a % 2 != 0){
                a = 0;
            }
            return a;
        };
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,89,12));
        list.replaceAll(unOp);
        System.out.println(list);
    }
}
