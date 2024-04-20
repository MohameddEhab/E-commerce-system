package com.company;

public class ClothingProduct extends product {
    private  String size;
    private String fabric;
public ClothingProduct(String name,int productld,float price,String size,String fabric){
    super(name,productld,price);
    this.size=size;
    this.fabric=fabric;
}
    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }
}
