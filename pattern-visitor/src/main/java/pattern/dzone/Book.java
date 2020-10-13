package pattern.dzone;

public class Book implements Visitable {
    private double price = 8.0;
    private double weight = 3.2;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }
}
