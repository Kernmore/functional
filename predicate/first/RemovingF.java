package com.functional.predicate.first;

import java.util.ArrayList;
import java.util.List;

public class RemovingF {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Number", "Real", "Formula", "Formula-1"));
        list.removeIf(a -> a.startsWith("F"));
        System.out.println(list);
    }

}
