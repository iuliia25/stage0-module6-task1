package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    Animal(String setColor, int setNumberOfPaws, boolean setHasFur){
         this.setColor("color");
         this.setNumberOfPaws(0);
         this.setHasFur(true);
    }


    public void getDescription() {
        System.out.print("This animal is mostly " + getColor() + " . It has " + getNumberOfPaws());
        if (getNumberOfPaws() == 1) {
            System.out.print(" paw ");
        } else {
            System.out.print(" paws ");
        }
        System.out.print("and ");
        if (isHasFur()) {
            System.out.print("a");
        } else {
            System.out.print("no");
        }
        System.out.print(" fur.");
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
