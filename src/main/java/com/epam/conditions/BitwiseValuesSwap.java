package com.epam.conditions;

public class BitwiseValuesSwap {

    public static void swap(int first, int second) {
        first = first ^ second;
        second = first^ second;
        first = second ^ first;
        System.out.println(first);
        System.out.println(second);
    }



}
