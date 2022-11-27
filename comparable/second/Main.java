package com.functional.comparable.second;

public class Main<T> {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{23, 45, 34, 41, 92, 54, 23, 13};
        System.out.println(max(integers));
    }


    public static <T extends Comparable<T>> T max(T[] array){
        T temp = array[0];
        for (int i = 1; i < array.length; i++) {
            if(temp.compareTo(array[i]) < 0){
                temp = array[i];
            }
        }
        return temp;
    }
}
