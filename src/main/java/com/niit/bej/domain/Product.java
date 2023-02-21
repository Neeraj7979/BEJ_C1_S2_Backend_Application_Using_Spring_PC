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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}
