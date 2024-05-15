import services.PrintService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();



        System.out.println("How many values will you enter?");
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter " + (1 + i) + "# value:");
            String value = sc.next();
            ps.addValue(value);
        }

        System.out.println();
        ps.print();
        System.out.println();
        System.out.println("First = " + ps.first());


        sc.close();
    }
}