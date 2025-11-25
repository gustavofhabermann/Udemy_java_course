import java.util.ArrayList;
import java.util.List;

import entites.Product;
import services.ProductServices;

public class App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Teste", 900.00));
        list.add(new Product("MTeste", 50.00));
        list.add(new Product("Teste", 100.00));
        list.add(new Product("NTeste", 800.00));

        ProductServices ps = new ProductServices();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'N');

        System.out.println("Sum = " + String.format("%.2f", sum));

    }
}
