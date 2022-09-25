package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(){}
    public Animal (String col, int paws, boolean fur) {
        this.color = col;
        this.numberOfPaws = paws;
        this.hasFur = fur;
    }

    public String getDescription() {
        String result;
        result = "This animal is mostly " + color + ". It has " + numberOfPaws;
        if (numberOfPaws == 1) {
            result += " paw ";
        } else {
            result += " paws ";
        }
        result += "and ";
        if (hasFur) {
            result += "a";
        } else {
            result +="no";
        }
        result +=" fur.";
        return result;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
