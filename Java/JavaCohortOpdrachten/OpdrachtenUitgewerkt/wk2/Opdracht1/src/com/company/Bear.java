package com.company;

public class Bear extends Animal {
    String type;

    public Bear(String name, Integer leeftijd, String type, Integer weight) {
        super(name, leeftijd);
        this.type = type;
    }

    public String showType () {
//        System.out.println(type);
//        System.out.println(Animal.type);
        return type;
    }

    public void feed() {
        System.out.println("feeding method, this method is overrided");
    }

    public void feed (String x) {
        System.out.println(x);
    }

    public void visitVet(){
        System.out.println("The bear has eaten the vet");
    }

}
