package com.codecool.farm.animal;

public class Pig extends Animal {

    @Override
    public void feed() {
        setSize(getSize() + 1);
    }

}
