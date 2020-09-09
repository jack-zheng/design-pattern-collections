package com.jzheng.visitor.dzone;

public class Client {
    public static void main(String[] args) {
        Book book = new Book();
        Shoes shoes = new Shoes();
        PostageVisitor postageVisitor = new PostageVisitor();

        book.accept(postageVisitor);
        shoes.accept(postageVisitor);

        System.out.println("Total cost: " + postageVisitor.getTotalPostageForCart());
    }
}
