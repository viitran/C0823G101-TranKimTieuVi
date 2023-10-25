package ss12_java_collection_framework.exc.utils.comparator;

import ss12_java_collection_framework.exc.model.Product;

import java.util.Comparator;

public class PriceArrangeComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o2.getPrice() > o1.getPrice()) {
            return 1;
        } else if (o2.getPrice() == o1.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
