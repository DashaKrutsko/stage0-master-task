package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            String line = "";
            for (int j = cathetusLength; j >= 1; j--) {
                if (i >= j) {
                    line += "*";
                } else {
                    line += " ";
                }
            }
            System.out.println(line);
        }


    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
