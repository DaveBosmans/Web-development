package com.webshop.webshop.models;

import javax.persistence.*;

@Entity
@Table(name="products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String productName;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private String productDescription;

    @Column(nullable = false)
    private int inStock;

    public ProductModel(int id, String productName, double price, String productDescription, int inStock) {

        this.id = id;

        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.inStock = inStock;
    }

    public ProductModel(){

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
