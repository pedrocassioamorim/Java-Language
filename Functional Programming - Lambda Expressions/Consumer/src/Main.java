import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Reference methods estatico
        //list.forEach(Product::staticPriceUpDate);


        //Reference methods não estatico
        //list.forEach(Product::nonStaticUpDate);

        //Expressão Lambda Declarada:
        double factor = 1.1;
        Consumer<Product> cons = p -> {
            p.setPrice(p.getPrice() * factor);
        };

        //Expressão Lambda Inline



        list.forEach(p -> p.setPrice(p.getPrice() * factor));


        list.forEach(System.out::println);

    }
}