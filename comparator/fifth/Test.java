package com.functional.comparator.fifth;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s+|\\p{P}");
        Function<File, Integer> function = a -> {
            String string = a.getName();
            Matcher matcher = pattern.matcher(string);
            Integer count = 0;
            for (; matcher.find(); ) {
                count++;
            }
            return count;
        };
        Comparator<File> fileComparator = Comparator.comparing(function);
        File files = new File("Rust");
        File directory[] = files.listFiles();

        Arrays.sort(directory, fileComparator.reversed());
        for (var d :
                directory) {
            System.out.println(d.getName());
        }

    }
}
