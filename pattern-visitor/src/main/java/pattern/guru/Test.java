package pattern.guru;

public class Test {
    public static void main(String[] args) {
        XMLExportVisitor xmlExportVisitor = new XMLExportVisitor();
        Dot dot = new Dot(3, 4, 5);
        CompoundShape compoundShape = new CompoundShape(2);
        compoundShape.add(dot);
        System.out.println(xmlExportVisitor.visitCompoundGraphic(compoundShape));
    }
}
