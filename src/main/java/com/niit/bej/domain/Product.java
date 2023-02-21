package com.niit.bej.domain;

public class Product {
    private String productId;
    private String productName;
    private int productQuantity;
    private String productCategory;

    public Product(String productId, String productName, int productQuantity, String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productCategory = productCategory;
    }

    public Product() {
    }
}
