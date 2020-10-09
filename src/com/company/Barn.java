package com.company;

import java.util.ArrayList;


public class Barn {

    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        this.animals.add(animal);
    }

    public Animal getAnimal (String name){

        for(Animal animal :animals){
            if(animal.getName().equals(name)){
                return animal;
            }
        }
        return null;
    }
    public void theProduction (){
        System.out.println("The total production of the Barn");
    }
}



















 /*System.out.println("Animals name?");
         Scanner scanner = new Scanner(System.in);
         String animalName = scanner.next();*/
