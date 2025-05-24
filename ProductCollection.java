import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public ProductIterator iteratorByCategory(String category) {
        return new CategoryIterator(category);
    }

    public ProductIterator iteratorByPriceLessThan(double maxPrice) {
        return new PriceIterator(maxPrice);
    }

    private class CategoryIterator implements ProductIterator {
        private int index = 0;
        private String category;

        public CategoryIterator(String category) {
            this.category = category;
        }

        public boolean hasNext() {
            while (index < products.size()) {
                if (products.get(index).getCategory().equalsIgnoreCase(category)) {
                    return true;
                }
                index++;
            }
            return false;
        }

        public Product next() {
            return products.get(index++);
        }
    }

    private class PriceIterator implements ProductIterator {
        private int index = 0;
        private double maxPrice;

        public PriceIterator(double maxPrice) {
            this.maxPrice = maxPrice;
        }

        public boolean hasNext() {
            while (index < products.size()) {
                if (products.get(index).getPrice() < maxPrice) {
                    return true;
                }
                index++;
            }
            return false;
        }

        public Product next() {
            return products.get(index++);
        }
    }
}