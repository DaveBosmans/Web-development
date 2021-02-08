package com.company;

public class Main {

    public static void main(String[] args) {

//        TRIANGLE CLASS

//        Triangle triangleA = new Triangle(15,8,15,8, 17);
//        Triangle triangleB = new Triangle(3,2.598, 3 , 3, 3);
//
//        double triangleAArea = triangleA.findArea();
//        System.out.println(triangleAArea);
//
//        double triangleBArea = triangleB.findArea();
//        System.out.println(triangleBArea);
//
//        System.out.println(triangleA.sideLenThree);
//        System.out.println(triangleB.base);
//        System.out.println(Triangle.numsOfSides);

        StudentProfile profileOne = new StudentProfile("Dave", "Bosmans", "Back End Developer", 5, 2021);
        StudentProfile profileTwo = new StudentProfile("John", "Doe", "Front End Developer", 5, 2021);

        profileTwo.incrementExpectedGraduationYear();
        System.out.print(profileTwo.expectedYearToGraduate);
    }
}
