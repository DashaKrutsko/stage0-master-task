package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String fur = (this.hasFur) ? " a ": " no ";
        String paw = (this.numberOfPaws>1)? " paws":" paw";
        return "This animal is mostly " + this.color + ". It has "+ this.numberOfPaws + paw +" and" + fur + "fur.";
    }
}


