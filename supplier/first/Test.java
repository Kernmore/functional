package com.functional.supplier.first;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<String> sup = new WordGive("There are a few words in this sentence");
        String string;
        for(; (string = sup.get()) != null ;)    {
            System.out.println(string);
        }
    }
}

class WordGive implements Supplier<String> {
    private String text;
    private int count;
    public WordGive(String text){
        this.text = text;
        count = 0;
    }

    @Override
    public String get() {
        String[] strings = text.split(" ");
        if(strings.length == count){
            return null;
        }
        return strings[count++];
    }
}