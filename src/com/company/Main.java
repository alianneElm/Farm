package com.company;

import com.company.animals.Animal;
import com.company.animals.Cow;
import com.company.animals.Pig;

public class Main {

    public static void main(String[] args) {


        Barn myBarn = new Barn();
        Farmer farmer = new Farmer("Old Mcdonalds", myBarn);
        Farmer farmer1 = new Farmer("Mamma Mia", myBarn);

        Animal anna = new Animal("Anne");
        Animal juana = new Animal("Juana");
        Cow rita = new Cow("Rita");
        Cow paco = new Cow("Paco");
        Pig puerki = new Pig("Puerki");
        Pig cerdi = new Pig("Cerdi");

        myBarn.addAnimal(anna);
        myBarn.addAnimal(rita);
        myBarn.addAnimal(juana);
        myBarn.addAnimal(paco);
        myBarn.addAnimal(puerki);
        myBarn.addAnimal(cerdi);

        farmer.getMilk("Rita");
        farmer.getTheBacon("Cerdi");

        farmer1.getTheBacon("Puerki");
        farmer1.getMilk("Paco");











    }
}
