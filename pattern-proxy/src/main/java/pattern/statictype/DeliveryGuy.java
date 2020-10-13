package pattern.statictype;

import pattern.Customer;
import pattern.Order;

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
