package com.company;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void withText(){
        System.out.println("The name is "+ name);
    }
}
