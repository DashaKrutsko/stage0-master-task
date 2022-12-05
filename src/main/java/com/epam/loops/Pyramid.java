package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = cathetusLength; j>0; j--){
                if (j<=i){
                    line.append(j);
                } else {
                    line.append(" ");
                }
            }
            for (int j = 2; j<=cathetusLength; j++){
                if (j<=i){
                    line.append(j);
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        new Pyramid().printPyramid(6);
    }

}
