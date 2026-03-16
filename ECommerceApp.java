public class ECommerceApp {
    public static void main(String[] args) {
        Furniture[] cart = {
                new Chair(true),
                new Table(15.5),
                new Sofa(120.0)
        };

        ShippingVisitor shippingCalculator = new StandardShippingVisitor();
        double totalShippingCost = 0;

        System.out.println("--- Shipping Invoice ---");
        for (Furniture item : cart) {
            double cost = item.accept(shippingCalculator);
            totalShippingCost += cost;
            System.out.printf("Item: %s | Shipping: $%.2f%n", item.getClass().getSimpleName(), cost);
        }

        System.out.println("-------------------------");
        System.out.printf("Total Shipping: $%.2f%n", totalShippingCost);
    }
}