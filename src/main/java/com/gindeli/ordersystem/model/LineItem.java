package com.gindeli.ordersystem.model;

public class LineItem {
    private int lineItemID;
    private int orderID;
    private int productID;
    private double LineItemUnitPrice;
    private int quantity;
    private double LineItemDiscount;

    public int getLineItemID() {
        return lineItemID;
    }

    public void setLineItemID(int lineItemID) {
        this.lineItemID = lineItemID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getLineItemUnitPrice() {
        return LineItemUnitPrice;
    }

    public void setLineItemUnitPrice(double lineItemUnitPrice) {
        LineItemUnitPrice = lineItemUnitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getLineItemDiscount() {
        return LineItemDiscount;
    }

    public void setLineItemDiscount(double lineItemDiscount) {
        LineItemDiscount = lineItemDiscount;
    }
}
