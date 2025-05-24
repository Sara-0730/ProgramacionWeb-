public class Main {
    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();
        collection.addProduct(new Product("Laptop", "Electronics", 1200));
        collection.addProduct(new Product("Smartphone", "Electronics", 800));
        collection.addProduct(new Product("T-Shirt", "Clothing", 25));
        collection.addProduct(new Product("Jeans", "Clothing", 50));

        System.out.println("=== Productos en 'Electronics' ===");
        ProductIterator electronicsIterator = collection.iteratorByCategory("Electronics");
        while (electronicsIterator.hasNext()) {
            System.out.println(electronicsIterator.next());
        }

        System.out.println("\n=== Productos con precio < $100 ===");
        ProductIterator cheapIterator = collection.iteratorByPriceLessThan(100);
        while (cheapIterator.hasNext()) {
            System.out.println(cheapIterator.next());
        }
    }
}