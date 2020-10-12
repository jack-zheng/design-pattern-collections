package com.jzheng.proxy.statictype;

public class Client {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Order order = new DeliveryGuy(customer);
        order.order();
    }
}
