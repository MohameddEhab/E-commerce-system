package com.company;

public class BookProduct extends product {
    private String author;
    private String publisher;
    public BookProduct(String name,int productld,float price,String author ,String publisher){
        super(name,productld,price);
        this.author=author;
        this.publisher= publisher;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}
