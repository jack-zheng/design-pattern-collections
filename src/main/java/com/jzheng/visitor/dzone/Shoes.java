package com.jzheng.visitor.dzone;

public class Shoes implements Visitable {
    private double price = 11.0;
    private double weight = 5.9;

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
