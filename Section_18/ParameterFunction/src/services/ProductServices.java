package services;

import java.util.List;
import java.util.function.Predicate;

import entites.Product;

public class ProductServices {
    
    public double filteredSum(List<Product> list, Predicate<Product> criteria){

        double sum = 0.00;

        for(Product p: list){
            if(criteria.test(p)) {
                sum += p.getPrice();
            }
        }

        return sum;
    }

}
