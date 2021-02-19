package com.company;

public class Main {

    public static void main(String[] args) {


    //OPDRACHT 1 t/m 3
        Bear bear1 = new Bear("Willy", 8, "Brown Bear", 68);
        Bear bear2 = new Bear("Polly", 12, "Polly Bear", 70);
        Animal bird = new Animal("Birdy", 1);

        Bear bears[] = {bear1, bear2};
        Animal animals[] = {bear1, bear2, bird};
//
////        bear1.showType();
////        bear2.showType();
//
////        for (int i = 0; i < animals.length; i++) {
////            System.out.println(animals[i].showType());
////            System.out.println(animals[i].getName());
////        }
//
        for (Animal animalsLoop : animals) {
            animalsLoop.feed();
            animalsLoop.visitVet();
        }

        for (Bear bearsLoop : bears) {
            bearsLoop.feed();
            bearsLoop.feed("This feeding method is overloaded");
            bearsLoop.visitVet();
        }

    }


    }




