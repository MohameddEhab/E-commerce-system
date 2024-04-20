package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    product electronic = new ElectronicProduct("smartphone",1,599.9f,"Samsung",1);
    product clothing = new ClothingProduct("T-shirt",2,19.99f,"Medium","Cotton");
    product book = new BookProduct("OOP",3,39.99f,"O Reilly","X Publications");
        System.out.println("Welcome to the E-commerce System!");
        System.out.println(" Enter your ID ");
        int ID=scan.nextInt();
        scan.nextLine();
        System.out.println(" Enter your name");
        String name =scan.nextLine();
        System.out.println(" Enter your address ");
        String address = scan.nextLine();
        Customer customer=new Customer(ID,name,address);

        System.out.println("How many products do you want to add to your cart?");
        int nProducts = scan.nextInt();
        Cart cart = new Cart(customer.getCustomerld(),nProducts);

        for (int i = 0;i<nProducts;i++) {
            System.out.println("Which product would you like to add? 1- smartphone 2- T-shirt 3- OOP" );
            int productChoice = scan.nextInt();
            product product;
            switch (productChoice){
                case 1:
                    product=new ElectronicProduct("smartphone",1,599.9f,"Samsung",1);
                    break;
                case 2:
                    product= new ClothingProduct("T-shirt",2,19.99f,"Medium","Cotton");
                    break;
                case 3:
                    product = new BookProduct("OOP",3,39.99f,"O Reilly","X Publications");
                    break;
                default:
                    System.out.println("Invalid choice ");
                    i--;
                    continue;
            } cart.addProduct(product,i);

        }
        System.out.println("Your total is "+cart.calculatePrice()+" Do you want to place an order for the products in your cart? (1-yes or2- no) ");
        int resp = scan.nextInt();
        if (resp==1){
            System.out.println("Here is your order summary");
          Order order =new Order(ID,1,cart.getProducts(),(float)cart.calculatePrice());
           order.printOrderInfo();
        }
    }
}