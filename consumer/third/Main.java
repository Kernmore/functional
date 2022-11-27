package com.functional.consumer.third;

import java.io.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        File file = new File("Test.txt");

        BiConsumer<String, File> cons = Main::accept;

        cons.accept("Hello world", file);
    }

    public static void accept(String a, File b) {
        try {
            var pr = new PrintWriter(new FileOutputStream(b, true));
            pr.write(a);
            pr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


