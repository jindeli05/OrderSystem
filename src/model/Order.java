package model;

import dao.IorderCalculation;

import java.util.Date;
import java.util.List;

public class Order implements IorderCalculation {

    private int orderId;
    private String  OrderNumber;
    private int  customerId;
    private Date orderCreatedDate;
    private Date orderFulfilledDate;
    private double orderTotal;
    private double orderTaxTotal;
    private List<LineItem> lineItems;
    private List<ReturnItem> returnItems;

    public int getOrderID() {
        return orderId;
    }

    public void setOrderID(int orderId) {
        orderId = orderId;
    }

    public String getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        OrderNumber = orderNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerID(int customerId) {
        customerId = customerId;
    }

    public Date getOrderCreatedDate() {
        return orderCreatedDate;
    }

    public void setOrderCreatedDate(Date orderCreatedDate) {
        this.orderCreatedDate = orderCreatedDate;
    }

    public Date getOrderFulfilledDate() {
        return orderFulfilledDate;
    }

    public void setOrderFulfilledDate(Date orderFulfilledDate) {
        this.orderFulfilledDate = orderFulfilledDate;
    }

    public List<LineItem> getLineItems() {
       return lineItems;
    }

    public List<ReturnItem> getReturnedItems() {
        return returnItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @Override
    public double getOrderTotal() {
        return 0;
    }

    @Override
    public double getOrderTaxTotal() {
        return 0;
    }


}
