package pattern.dzone;

public interface Visitor {
    void visit(Book book);

    void visit(Shoes shoes);
}
