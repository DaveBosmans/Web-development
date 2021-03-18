package com.webshop.webshop.models;

public class productModel {
    private int id;
    private String productName;
    private double price;
    private String productDescription;
    private int inStock;

    public productModel(int id, String productName, double price, String productDescription, int inStock) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.inStock = inStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
}
