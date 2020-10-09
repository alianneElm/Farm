package com.company.animals;

public class Cow extends Animal {

     int milkAmount = 10;
    int totalMilk = 30;

    public Cow (String name){
      super(name);
    }

    public int getMilkAmount(){
        totalMilk -= milkAmount;
        return milkAmount;
    }

}
