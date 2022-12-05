package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        String isTriangle = "it's not a triangle";
        if (firstSide + secondSide <= thirdSide) {
            System.out.println(isTriangle);
        } else if (thirdSide + secondSide <= firstSide) {
            System.out.println(isTriangle);
        } else if (thirdSide + firstSide <= secondSide) {
            System.out.println(isTriangle);
        } else {
            System.out.println("this is a valid triangle");
        }
    }

}
