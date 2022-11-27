package com.functional.predicate.fifth;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class IntegerPredicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type Number");
        int number = sc.nextInt();

        System.out.println((isEven(number, a -> a % 2 == 0)));
    }

    public static boolean isEven(Integer i, IntPredicate pr){
        char[] numbers = i.toString().toCharArray();
        int count = 0;
        for (char c :
                numbers) {
            count += c;
        }
        return pr.test(count);
    }
}
