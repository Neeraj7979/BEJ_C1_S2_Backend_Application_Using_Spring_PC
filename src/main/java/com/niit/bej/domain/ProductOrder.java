package com.niit.bej.domain;

public class ProductOrder implements Order {
    private String orderId;
    private int orderQuantity;
    private double totalAmount;

    public ProductOrder(String orderId, int orderQuantity, double totalAmount) {
        this.orderId = orderId;
        this.orderQuantity = orderQuantity;
        this.totalAmount = totalAmount;
    }

    public ProductOrder() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
