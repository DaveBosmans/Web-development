package com.company;

public class Animal {
    private String name;
    private Integer leeftijd;
    public static String type = "Animal";

    public Animal(String name, Integer leeftijd) {
        this.name = name;
        this.leeftijd = leeftijd;

    }

    public void feed() {
        System.out.println("feeding method in Animal");
    }

    public void visitVet(){
        System.out.println("The vet is alive");
    }

    public String showName(){
        return name;
    }


    public String showType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(Integer leeftijd) {
        this.leeftijd = leeftijd;
    }
}
