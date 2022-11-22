package com.epam.langSyntax;

public class NumberReverter {

    public static void revert(int number) {
        int newNumber = 0;
        while(number != 0) {
            int digit = number % 10;
            newNumber = newNumber * 10 + digit;
            number /= 10;
        }
        System.out.println(newNumber);
    }

}
