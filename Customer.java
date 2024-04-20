package com.company;

public class Customer  {
    private int customerld;
    private String name;
    private String address;

    public Customer(int customerld,String name,String address){
        this.customerld=Math.abs(customerld);
        this.name=name;
        this.address=address;
    }
    public void setCustomerld(int customerld) {
        this.customerld = Math.abs(customerld);
    }

    public int getCustomerld() {
        return customerld;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
