package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //EXCEPTION
//        String s = null;
//        try {
//            var sub = s.substring(1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("Im not dead yet!");


        //TRY CATCH
//        String s = "";
//        try {
//            var sub = s.substring(1);
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//            System.out.println("Null pointer: " + e.getMessage());
//        } catch (StringIndexOutOfBoundsException e) {
//            e.printStackTrace();
//            System.out.println("Out of bounds: " + e.getMessage());
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("I dont know what happened: " + e.getMessage());
//        }
//        System.out.println("Im not dead yet!");

        //TRY CATCH WITH RESOURCES
//        var file = new File("hello.txt");
//        System.out.println("File exists " + file.exists());
//
//        try ( FileReader reader = new FileReader(file);
//              BufferedReader br = new BufferedReader(reader)) {
//            var text = br.readLine();
//            System.out.println(text);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        var sc = new Scanner(System.in);

        double d1, d2;

        try {
            System.out.println("Enter a numeric value: ");
            d1 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter a numeric value: ");
            d2 = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Couldnt format as a number");
            return;
        }
        System.out.println("Select and operation (+-*/): ");
        var operation = sc.nextLine();

        double result;
        switch (operation){
            case "+":
                result = d1 + d2;
                break;
            case "-":
                result = d1 - d2;
                break;
            case "*":
                result = d1 * d2;
                break;
            case "/":
                result = d1 / d2;
                break;
            default:
                System.out.println("You didn't choose a valid operation");
                return;
        }
        System.out.println("The answer is " + result);

    }
}
