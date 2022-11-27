package com.functional.comparable.first;

import java.util.Arrays;

public class Main<T> {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(3,4);
        Rectangle rec2 = new Rectangle(5,6);
        Rectangle rec3 = new Rectangle(3,7);
        Rectangle rec4 = new Rectangle(2,6);
        Rectangle rec5 = new Rectangle(3,4);

        Rectangle[] rectangles = new Rectangle[]{rec1, rec2, rec3, rec4, rec5};
        for (Rectangle r : rectangles) {
            System.out.println(r.getS());
        }

        System.out.println();
        Arrays.sort(rectangles);
        for (Rectangle r : rectangles) {
            System.out.println(r.getS());
        }
//        System.out.println(rec1.equals(rec4));
    }


}
