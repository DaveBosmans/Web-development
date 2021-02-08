package com.company.model;

public class ClothingItem {
//    public ClothingItem() {
//    }

public static final String SHIRT = "Shirt";
public static final String PANTS = "Pants";
public static final String SHOES = "Shoes";

    private String type;
    private ClothingSize size;
    private double prize;
    private int quantity;

    public ClothingItem(String type, ClothingSize size, double prize, int quantity) {
        this.type = type;
        this.size = size;
        this.prize = prize;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ClothingSize getSize() {
        return size;
    }

    public void setSize(ClothingSize size) {
        this.size = size;
    }


    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




}
