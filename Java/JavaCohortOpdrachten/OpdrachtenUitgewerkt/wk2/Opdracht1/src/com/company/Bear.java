package com.company;

public class Bear extends Animal {


    public Bear(String name, Integer leeftijd, String type) {
        super(name, leeftijd);
        Animal.type = type;
    }
}
