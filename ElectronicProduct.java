package com.company;

public class ElectronicProduct extends product {
    private String brand;
    private int warrantyPeriod;
public  ElectronicProduct(String name,int productld,float price,String brand,int warrantyPeriod){
    super(name,productld,price);
    this.brand=brand;
    this.warrantyPeriod=Math.abs(warrantyPeriod);
}
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
