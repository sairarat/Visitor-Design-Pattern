class StandardShippingVisitor implements ShippingVisitor {

    @Override
    public double visit(Chair chair) {
        // Flat rate: Foldable chairs are cheaper to ship
        return chair.isFoldable() ? 5.0 : 10.0;
    }

    @Override
    public double visit(Table table) {
        // Calculation based on surface area
        return table.getSurfaceArea() * 2.0;
    }

    @Override
    public double visit(Sofa sofa) {
        // Bulky item: weight-based calculation
        return sofa.getWeight() * 0.5 + 50.0;
    }
}