package com.jzheng.visitor.guru;

public class RecursionClient {
    public static void main(String[] args) {
        Dot dot1 = new Dot(1, 1, 1);
        Dot dot2 = new Dot(2, 2, 2);
        Dot dot3 = new Dot(3, 3, 3);

        CompoundShape s1 = new CompoundShape(4);
        CompoundShape s2 = new CompoundShape(5);
        CompoundShape s3 = new CompoundShape(6);

        s1.add(dot1);
        s2.add(dot2);
        s3.add(dot3);

        s1.add(s2);
        s2.add(s3);

        XMLExportVisitor xmlExportVisitor = new XMLExportVisitor();
        System.out.println(xmlExportVisitor.visitCompoundGraphic(s1));
    }
}
