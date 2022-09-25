package com.epam.mjc.stage0;

public class Bird extends Animal {
    Bird() {
        super ("blue", 2, false);
    }
    public void getDescription() {
        System.out.print("This animal is mostly " + getColor() + " . It has " + getNumberOfPaws() + " paws and no fur. Moreover, it has 2 wings and can fly.");
    }

}
