package com.company;

public class product {
   private String name;
   private int productld;
   private float price;
public product(String name,int productld,float price){
    this.name=name;
    this.productld=Math.abs(productld);
    this.price=Math.abs(price);
}
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProductld(int productld) {
        this.productld = Math.abs(productld);
    }

    public int getProductld() {
        return productld;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    }

    public float getPrice() {
        return price;
    }
}
