package com.niit.bej.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductOrder that = (ProductOrder) o;
        return orderQuantity == that.orderQuantity && Double.compare(that.totalAmount, totalAmount) == 0 && Objects.equals(orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderQuantity, totalAmount);
    }

    @Override
    public String toString() {
        return "ProductOrder{" + "orderId='" + orderId + '\'' + ", orderQuantity=" + orderQuantity + ", totalAmount=" + totalAmount + '}';
    }
}
