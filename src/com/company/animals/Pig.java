package com.company.animals;

public class Pig extends Animal {
    int theBacon = 30;
    int totalBacon = 50;

    public Pig(String name) {
        super(name);

    }

    public int getBacon(){
        totalBacon -= theBacon;
        return theBacon;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "theBacon=" + theBacon +
                ", totalBacon=" + totalBacon +
                '}';
    }

}


