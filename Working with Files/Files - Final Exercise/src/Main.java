import entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException, NumberFormatException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        File sourcefile = new File("//home//amorim//IdeaProjects//Trabalhando com files - exerc final//src//source.txt");
        String sourceFolder = sourcefile.getParent();

        List<Product> list = new ArrayList<>();

        boolean success = new File(sourceFolder + "/Test").mkdir();

        String targetFileStr = sourceFolder + "//Test//summary.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(sourcefile.getPath()))){

            String itemCsv = br.readLine();
            while (itemCsv != null){
                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name,price,quantity));


                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for (Product item : list){
                    bw.write(item.getName() + ", " + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + ": Created!");

            }
            catch (IOException e){
                System.out.println("Error writing File: " + e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println("Error writing File: " + e.getMessage());
        }


        sc.close();
    }
}