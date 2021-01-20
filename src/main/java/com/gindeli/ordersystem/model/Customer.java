package com.gindeli.ordersystem.model;

import com.gindeli.ordersystem.dao.IorderCalculation;

import java.util.Date;
import java.util.List;

public class Customer implements IorderCalculation {

    private int customerId;
    private String  firstName;
    private String  LastName;
    private Date Dob;
    private List<Address> addresses;

    private double orderTotal;
    private double orderTaxTotal;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date dob) {
        Dob = dob;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses ) {
        this.addresses = addresses;
    }

    @Override
    public double getOrderTotal() {
        return orderTotal;
    }

    @Override
    public double getOrderTaxTotal() {
        return orderTaxTotal;
    }

}
