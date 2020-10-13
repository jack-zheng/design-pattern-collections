package pattern.dzone;

public class PostageVisitor implements Visitor {
    private double totalPostageForCart;

    @Override
    public void visit(Book book) {
        // rule to calculate book postage cost
        // if price over 10, free postage.
        if(book.getPrice() < 10.0) {
            totalPostageForCart += book.getWeight() * 2;
        }
    }

    @Override
    public void visit(Shoes shoes) {
        // rule to calculate shoes postage cost
        totalPostageForCart += shoes.getPrice();
    }

    public double getTotalPostageForCart() {
        return this.totalPostageForCart;
    }
}
