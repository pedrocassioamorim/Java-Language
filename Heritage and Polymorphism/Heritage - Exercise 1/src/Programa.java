import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Programa {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter the number of Products: ");
        int n = sc.nextInt();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();


        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter the #" + (i+1) + " product: ");
            System.out.println("Commom, Used or Imported? (c/u/i)");
            char tipo = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();

            if (tipo == 'i'){
                System.out.println("Customs Fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name,price,customsFee);
                list.add(product);
            }
            else if (tipo == 'u'){
                System.out.println("Manufacture Date (DD/MM/YYYY)");
                sc.nextLine();
                Date manufactureDate = sdf.parse(sc.nextLine());
                Product product = new UsedProduct(name, price,manufactureDate);
                list.add(product);
            }
            else {
                Product product = new Product(name, price);
                list.add(product);
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : list){
            System.out.println(product.priceTag());
        }



        System.out.println();
        sc.close();
        System.out.println("FIM");
    }
}