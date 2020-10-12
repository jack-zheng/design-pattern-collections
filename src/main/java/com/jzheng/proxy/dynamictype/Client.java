package com.jzheng.proxy.dynamictype;

import com.jzheng.proxy.statictype.Customer;
import com.jzheng.proxy.statictype.Order;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        LogHandler logHandler = new LogHandler(new Customer());
        Order order = (Order) (Proxy.newProxyInstance(Order.class.getClassLoader(), new Class[] {Order.class}, logHandler));
        order.order();
    }
}
