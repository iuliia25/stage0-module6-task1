package com.epam.mjc.stage0;

public class Bird extends Animal {
    public Bird() {
        super();
        this.setColor("blue");
        this.setNumberOfPaws(2);
        this.setHasFur(false);
    }
    @Override
    public void getDescription() {
        System.out.print("This animal is mostly "+ getColor() + " . It has " + getNumberOfPaws() + " paws and no fur. Moreover, it has 2 wings and can fly.");
    }
}
