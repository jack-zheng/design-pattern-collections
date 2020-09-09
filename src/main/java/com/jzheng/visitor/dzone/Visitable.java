package com.jzheng.visitor.dzone;

public interface Visitable {
    void accept(Visitor visitor);
}
