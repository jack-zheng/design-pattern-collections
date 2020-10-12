package com.jzheng.proxy.statictype;

public class DeliveryGuy implements Order {
    private Customer customer;

    public DeliveryGuy(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void order() {
        customer.order();
    }
}
