package com.company;

public class Order {
    private int customerld;
    private int orderld;
    private product[]products;
    private float totalPrice;

    public Order(int customerld, int orderld ,product[]products ,float totalPrice){
       this.customerld=Math.abs(customerld);
       this.orderld=Math.abs(orderld);
       this.totalPrice=Math.abs(totalPrice);
       this.products=products;
    }

    public void setCustomerld(int customerld) {
        this.customerld = Math.abs(customerld);
    }

    public int getCustomerld() {
        return customerld;
    }

    public void setOrderld(int orderld) {
        this.orderld =Math.abs( orderld);
    }

    public int getOrderld() {
        return orderld;
    }

    public void setProducts(product[] products) {
        this.products = products;
    }

    public product[] getProducts() {
        return products;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice =Math.abs( totalPrice);
    }

    public float getTotalPrice() {
        return totalPrice;
    }
    public void printOrderInfo(){
        System.out.println("Order ID "+orderld);
        System.out.println("Customer ID "+ customerld);
        System.out.println("Products :");
        for (product product : products){
            System.out.println(" - "+ product.getName() +" , Price :"+ product.getPrice());
        }
        System.out.println("total price "+ totalPrice);
    }
}
