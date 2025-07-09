package util;

import java.util.function.Consumer;

import entites.Product;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
       p.setValue(p.getValue() * 1.1);
    }
    
}
