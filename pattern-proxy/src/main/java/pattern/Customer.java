package pattern;

public class Customer implements Order {

    @Override
    public void order() {
        System.out.println("Order and pay money...");
    }
}