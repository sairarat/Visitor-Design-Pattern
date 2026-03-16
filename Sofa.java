class Sofa implements Furniture {
    private final double weight;

    public Sofa(double weight) {
        this.weight = weight;
    }

    public double getWeight() { return weight; }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}