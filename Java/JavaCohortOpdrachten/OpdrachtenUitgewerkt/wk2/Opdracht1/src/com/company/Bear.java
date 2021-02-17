package com.company;

public class Bear extends Animal {
    String type;

    public Bear(String name, Integer leeftijd, String type) {
        super(name, leeftijd);
        this.type = type;
    }

    public String showType () {
//        System.out.println(type);
//        System.out.println(Animal.type);
        return type;
    }

}
