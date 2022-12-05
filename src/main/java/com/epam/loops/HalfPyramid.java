package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = cathetusLength; j >= 1; j--) {
                if (i >= j) {
                    line.append("*");
                } else {
                    line.append(" ");
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
