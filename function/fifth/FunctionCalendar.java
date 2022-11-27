package com.functional.function.fifth;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.function.IntFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class FunctionCalendar {
    public static void main(String[] args) {
        ToIntFunction<Calendar> fun = a -> a.get(Calendar.YEAR);
        System.out.println(fun.applyAsInt(Calendar.getInstance()));

    }
}
