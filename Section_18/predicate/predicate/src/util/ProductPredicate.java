package util;

import java.util.function.Predicate;

import entites.Product;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getValue() >= 100.0;
    }
    

    
}
