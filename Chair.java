class Chair implements Furniture {
    private final boolean isFoldable;

    public Chair(boolean isFoldable) {
        this.isFoldable = isFoldable;
    }

    public boolean isFoldable() { return isFoldable; }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visit(this);
    }
}