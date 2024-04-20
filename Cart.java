package com.company;

public class Cart {
    private int customerld;
    private int nProducts;
    private product[]products;

    public Cart (int customerld, int nProducts){
        this.customerld= Math.abs(customerld);
        this.nProducts= Math.abs(nProducts);
        this.products=new product[nProducts];

    }
    public void setCustomerld(int customerld) {

        this.customerld = Math.abs(customerld);
    }

    public int getCustomerld() {

        return customerld;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
        this.products=new product[this.nProducts];
    }

    public product[] getProducts() {
        return products;
    }
    public void addProduct(product product,int index){
        if(index>=0&& index < nProducts){
            products[index]=product;
        }else {
            System.out.println("invalid index");

        }
    }
       public  void removeProduct(int index){
        if(index >=0&& index< nProducts){
            products[index]=null;
        }else {
            System.out.println(" invalid index");
        }
       }
    public double calculatePrice(){
       float totalPrice= 0;
        for (product product: products){
            if (product!=null){
                totalPrice+=product.getPrice();
            }
        }
        return totalPrice;
    }
    public void placeOrder(){
        System.out.println("Order Placed Successfully");
    }
}
