package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    public Lion(String sex, Predator predator) throws Exception {
        if ("Самец".equals(sex)) {
           this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
        this.predator = predator;
    }

    private Predator predator;

    public int getKittens() {
        return predator.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();

    }
}
