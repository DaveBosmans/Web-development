package com.company;


public class Main {

    public static void main(String[] args) {

        //Wanneer is een class abstract? Een class is abstract wanneer deze informatie bevat die niet hoeft te instatieren, je maakt een class abstract door het woordje "abstract" ervoor te zetten.
        //Maak in je Student class een abstract method passYear(). Kan je al bedenken op wat voor plek je de code voor passYear() zou moeten implementeren?


        SecondYear dave = new SecondYear();

        //NOTITIES EERSTE JAAR
        dave.addNotitie("Goede Student");
        System.out.println("Notities van dave zijn : " + dave.notitiesStudent);

        //CIJFERS EERSTE JAAR
        dave.changeCijfers(7, 8, 4);
        for (int i = 0; i < dave.cijfers.length; i++) {
            System.out.println("Cijfers van dave = " + dave.cijfers[i]);
        }

        //VAKKEN EERSTE JAAR
        dave.changeVakken("Java", "React.js", "SpringBoot");
        for (int i = 0; i < dave.vakken.length; i++) {
            System.out.println("vakken van Dave = " + dave.vakken[i]);
        }
    }
}
