package com.gindeli.ordersystem.model;

public class ReturnItem {
    
    private int returnedItemId;
    private int orderId;
    private int lineItemId;
    private int quantity;

    public int getReturnedItemId() {
        return returnedItemId;
    }

    public void setReturnedItemId(int returnedItemId) {
        this.returnedItemId = returnedItemId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(int lineItemId) {
        this.lineItemId = lineItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmountReturned() {
        return amountReturned;
    }

    public void setAmountReturned(double amountReturned) {
        this.amountReturned = amountReturned;
    }

    private double amountReturned;
}
