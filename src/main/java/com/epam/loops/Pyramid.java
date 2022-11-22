package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int x = 0;
        for (int i = 1; i <= cathetusLength; i++) {
            String line = "";
            for (int j = cathetusLength; j>0; j--){
                if (j<=i){
                    line = line + j;
                } else {
                    line = line +" ";
                }
            }
            for (int j = 2; j<=cathetusLength; j++){
                if (j<=i){
                    line = line +j;
                } else {
                    line = line +"";
                }
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        new Pyramid().printPyramid(6);
    }

}
