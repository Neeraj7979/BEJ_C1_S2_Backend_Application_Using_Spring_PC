package com.niit.bej.domain;

import java.util.Objects;

public class Product {
    private String productId;
    private String productName;
    private int productQuantity;
    private String productCategory;

    private ProductOrder productOrder;

    public Product(String productId, String productName, int productQuantity, String productCategory, ProductOrder productOrder) {
        this.productId = productId;
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.productCategory = productCategory;
        this.productOrder = productOrder;
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

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(ProductOrder productOrder) {
        this.productOrder = productOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productQuantity == product.productQuantity && Objects.equals(productId, product.productId) && Objects.equals(productName, product.productName) && Objects.equals(productCategory, product.productCategory) && Objects.equals(productOrder, product.productOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, productQuantity, productCategory, productOrder);
    }

    @Override
    public String toString() {
        return "Product{" + "productId='" + productId + '\'' + ", productName='" + productName + '\'' + ", productQuantity=" + productQuantity + ", productCategory='" + productCategory + '\'' + ", productOrder=" + productOrder + '}';
    }
}
