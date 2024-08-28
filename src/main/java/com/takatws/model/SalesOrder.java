package com.takatws.model;

import java.util.List;

public class SalesOrder {
    private String number;
    private Customer customer;
    private List<SalesItem> salesItems;
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public List<SalesItem> getSalesItems() {
        return salesItems;
    }
    public void setSalesItems(List<SalesItem> salesItems) {
        this.salesItems = salesItems;
    }
}
