package com.company;

import com.company.model.ClothingItem;
import com.company.model.ClothingSize;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {

        //CALCULATOR FROM CLASS
//        var sc = new Scanner(System.in);
//
//        double d1, d2;
//
//        try {
//            System.out.println("Enter a numeric value: ");
//            d1 = sc.nextDouble();
//            sc.nextLine();
//
//            System.out.println("Enter a numeric value: ");
//            d2 = sc.nextDouble();
//            sc.nextLine();
//        } catch (InputMismatchException e) {
//            System.out.println("Couldnt format as a number");
//            return;
//        }
//        System.out.println("Select and operation (+-*/): ");
//        var operation = sc.nextLine();
//
//        double result;
//        switch (operation){
//            case "+":
//                result = CalcHelper.addValues(d1, d2);
//                break;
//            case "-":
//                result = CalcHelper.substractValues(d1, d2);
//                break;
//            case "*":
//                result = CalcHelper.multiplyValues(d1, d2);
//                break;
//            case "/":
//                result = CalcHelper.divideValues(d1, d2);
//                break;
//            default:
//                System.out.println("You didn't choose a valid operation");
//                return;
//        }
//        System.out.println("The answer is " + result);

        var item = new ClothingItem(ClothingItem.SHIRT,
                ClothingSize.L,
                19.99,
                3);
//        item.setType("Shirt");
//        item.setSize("M");
//        item.setPrize(19.99);
//        item.setQuantity(3);

        var totalPrice = item.getPrize() * item.getQuantity();
        var formatter = NumberFormat.getCurrencyInstance();
        var output = String.format("Your %s %s order will cost %s",
                item.getSize(),
                item.getType(),
                formatter.format(totalPrice));
        System.out.println(output);
    }
}
