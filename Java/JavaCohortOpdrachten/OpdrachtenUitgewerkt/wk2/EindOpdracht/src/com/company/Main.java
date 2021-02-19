package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    Bird papagaai = new Bird("Bird", "Birdy",26, "17/04/1994");
    Reptile bandedGilaMonster = new Reptile("Reptile", "Monster", 21, "12/01/2010");
    Cat jinx = new Cat("Cat", "Jade", 5, "19/02/2017");


        List<Object> animalsList = new ArrayList<Object>();

        animalsList.add(papagaai);
        animalsList.add(bandedGilaMonster);

        System.out.println(animalsList);




    }
}
