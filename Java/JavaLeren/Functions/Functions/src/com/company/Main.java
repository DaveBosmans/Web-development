package com.company;
import java.util.Scanner;

public class Main {
//FUNCTIONS
    public static void annouceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in a random word and press Enter to start developer tea time");
        Scanner input = new Scanner (System.in);
        input.next();
        System.out.println("Its developer tea time!");
    }

    //FUNCTION WITH PARAMETERS
    public static void calculateTotalMealPrice(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }

    //FUNCTION WITH INPUTS
    public static double calculateTotalMealPriceInputs(double listedMealPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        return result;
    }

    //Calculate an Employee's Salary
    public static double calculateSalary (double hours,
                                          double hourlyRate) {
        if (hours < 0){
            return -1;
        }

        if (hourlyRate < 0){
            return -1;
        }

        double weeklyEarning = hours * hourlyRate;
        double yearly = weeklyEarning * 52;
        return yearly;
    }

    public static void main(String[] args) {
       //FUNCTIONS
//        System.out.print("Welcome to your new job!");
//
//        annouceDeveloperTeaTime();
//
//        System.out.println("Write code!");
//        System.out.println("Review code!");
//
//        annouceDeveloperTeaTime();
//
//        System.out.println("Get promoted!");


        //FUNCTION WITH PARAMETERS
//        calculateTotalMealPrice(15, .2, .09);
//        calculateTotalMealPrice(25, .18, .09);

        //FUNCTION WITH INPUTS
//       double groupTotalMealPrice = calculateTotalMealPriceInputs(100, .2, .08);
//       System.out.println(groupTotalMealPrice);
//
//       double individualMealPrice = groupTotalMealPrice /5;
//       System.out.println(individualMealPrice);


        //BUILD IN FUNCTION
        //You dont have to define the function yourself you can just call it.
        //All you have to know is the functions inputs and output as well as the gist of what the function does.
        //Built-in functions have been well tested so they are guarenteed to do what they are described to do.
//        double result = Math.pow(2, 5);
//        System.out.println(result);


      //SALARY CALCULATING
        double valueHours;
        double valueRate;
        System.out.println("How many hours per week do you work?");
        Scanner hoursPerWeek = new Scanner(System.in);
        valueHours = hoursPerWeek.nextDouble();
        System.out.println("What is your hourly rate?");
        Scanner hourlyRate = new Scanner(System.in);
        valueRate = hourlyRate.nextDouble();

//        calculateSalary(hoursPerWeek, hourlyRate);
        System.out.println("Your yearly salary is: " + calculateSalary(valueRate, valueHours));
    }
}
