import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Implementando a Interface
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //names.forEach(System.out::println);

        // Reference Method com método estático:
        //List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        // Reference Method com método normal:
        //List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //Expressão Lambda Declarada
        //Function<Product, String> func = p -> p.getName().toUpperCase();
        //List<String> names = list.stream().map(func).collect(Collectors.toList());

        //Expressão Lambda Inline:
        //List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
        //names.forEach(System.out::println);

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        double soma = ps.filteredSum(list, p -> p.getPrice() > 100);

        System.out.println("Sum: " + String.format("%.2f", sum));


    }
}