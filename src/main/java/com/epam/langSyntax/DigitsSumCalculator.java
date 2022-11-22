package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sumNumber = 0;
        while(number != 0) {
            int digit = number % 10;
            sumNumber +=digit;
            number /= 10;
        }
        System.out.println(sumNumber);

    }

}
