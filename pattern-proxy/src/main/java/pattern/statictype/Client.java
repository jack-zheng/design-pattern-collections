package pattern.statictype;

import pattern.Customer;
import pattern.Order;

public class Client {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Order order = new DeliveryGuy(customer);
        order.order();
    }
}

