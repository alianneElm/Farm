package com.company;

import com.company.Animal;

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

    //para probar git
    public  void withMilk(){
        System.out.println("The total milk is "+ totalMilk);
    }

    @Override
    public String toString() {
        return "Cow{" +
                "milkAmount=" + milkAmount +
                ", totalMilk=" + totalMilk +
                '}';
    }
}
