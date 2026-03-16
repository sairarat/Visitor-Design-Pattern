// The Visitor Interface
interface ShippingVisitor {
    double visit(Chair chair);
    double visit(Table table);
    double visit(Sofa sofa);
}