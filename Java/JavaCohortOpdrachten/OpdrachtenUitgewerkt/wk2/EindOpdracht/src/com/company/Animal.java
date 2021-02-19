package com.company;

public class Animal extends Zoo {
    private String animalType;
    private String name;
    private Integer leeftijd;
    private String geboortedag;

    public Animal(String animalType, String name, Integer leeftijd, String geboortedag) {
        this.animalType = animalType;
        this.name = name;
        this.leeftijd = leeftijd;
        this.geboortedag = geboortedag;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
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

    public String getGeboortedag() {
        return geboortedag;
    }

    public void setGeboortedag(String geboortedag) {
        this.geboortedag = geboortedag;
    }
}
