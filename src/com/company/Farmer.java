package com.company;

import com.company.animals.Animal;
import com.company.animals.Cow;
import com.company.animals.Pig;


public class Farmer extends Person{

     int bacon = 0;
     int milk = 0;
     Barn barn;

    public Farmer(String name, Barn barn) {
        super(name);
        this.barn = barn;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "bacon=" + bacon +
                ", milk=" + milk +
                ", barn=" + barn +
                ", name='" + name + '\'' +
                '}';
    }

    public void getMilk(String name){
        Animal tempAnimal= barn.getAnimal(name);
        milk+= ((Cow)tempAnimal).getMilkAmount();
        System.out.println(" The milk amount is: "+ milk);

    }
    public void getTheBacon(String name){
        Animal tempAnimal = barn.getAnimal(name);
        bacon = bacon + ((Pig) tempAnimal).getBacon();
        System.out.println(" The bacon amount is: "+ bacon);
    }



}
