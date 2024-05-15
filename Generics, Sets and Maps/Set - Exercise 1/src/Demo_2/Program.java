package Demo_2;

import Demo_2.entities.Product;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        Map<Product, Double> stock = new HashMap<>();

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("PC", 1500.0);
        Product p3 = new Product("Air Conditioner", 2000.0);

        stock.put(p1, 10000.0);
        stock.put(p2, 20000.0);
        stock.put(p3, 30000.0);

        Product ps = new Product("PC", 1500.0);

        System.out.println("Contains 'PS' key: " + stock.containsKey(ps));






    }
}
