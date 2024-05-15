import entities.MyComparator;
import entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("PC", 1500.0);
        Product p3 = new Product("Air Condicionado", 500.0);
        Product p4 = new Product("Geladeira", 400.0);

        List<Product> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        // Declaração de Comparator no código, sem criar classe específica.
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        // Sintaxe Arrow Function
        Comparator<Product> comp1 = (t1, t2) -> {
            return t1.getName().toUpperCase().compareTo(t2.getName().toUpperCase());
        };

        //Sintaxe Arrow Function - menor ainda:
        Comparator<Product> comp2 = (r1, r2) -> r1.getName().toUpperCase().compareTo(r2.getName().toUpperCase());

        //Sintaxe concisa e resumida, em uma unica linha:
        list.sort((r1, r2) -> r1.getName().toUpperCase().compareTo(r2.getName().toUpperCase()));

        //Esses são exemplos de comparators definidos com a sintaxe de expressão lambda.

        for (Product p : list){
            System.out.println(p);
        }


    }
}