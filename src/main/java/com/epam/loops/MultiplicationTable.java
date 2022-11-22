package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        printTable(1);
    }

    public static void printTable(int numberTableToPrint) {

        for (int i=1; i<=10; i++){
            System.out.println( i+ " x "+numberTableToPrint+" = " + numberTableToPrint*i);
        }
    }

}
