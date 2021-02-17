package com.company;

public class Main {

    public static void main(String[] args) {
        Bear bear1 = new Bear("Willy", 8, "Brown Bear");
        Bear bear2 = new Bear("Polly", 12, "Polly Bear");
        Animal bird = new Animal("Birdy", 1);

        Bear bears[] = {bear1, bear2};
        Animal animals[] = {bear1, bear2, bird};

//        bear1.showType();
//        bear2.showType();

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].showType());
            System.out.println(animals[i].getName());
        }

    }
}


