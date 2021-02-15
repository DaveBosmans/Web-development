package com.company;

public class Animal {
    private String name;
    private Integer leeftijd;
    public static String type = "Animal";

    public Animal(String name, Integer leeftijd, String type) {
        this.name = name;
        this.leeftijd = leeftijd;
        Animal.type = type
    }

    public void feed() {

    }

    public void visitVet(){

    }



}
