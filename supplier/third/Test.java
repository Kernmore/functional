package com.functional.supplier.third;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.IntSupplier;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 56, 78, 45, 23, 345, 54,};

        for (int i = 0; i < array.length; i++) {
            IntSupplier sup = giveElement(i, array);
            System.out.println(sup.getAsInt());

        }
    }
    public static IntSupplier giveElement(int count, int[] array){
        IntSupplier sup = () -> array[count];
        return sup;
    }
}
