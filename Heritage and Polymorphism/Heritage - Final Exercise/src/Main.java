import entities.Company;
import entities.Individual;
import entities.Payer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Tax Payers: ");
        int n = sc.nextInt();
        System.out.println();

        List<Payer> list = new ArrayList<>();

        for (int i = 0 ; i < n ; i++ ){
            System.out.println("Tax Payer #" + (i+1) + " data:");
            System.out.println("Individual or Company? (i/c)");
            char tipo = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Annual Income: ");
            Double income = sc.nextDouble();
            if (tipo == 'i'){
                System.out.println("Health Expenditures: ");
                Double health = sc.nextDouble();
                Payer ind = new Individual(name, income, health);
                list.add(ind);
            } else if (tipo == 'c') {
                System.out.println("Number of Employees:");
                Integer employees = sc.nextInt();
                Payer ind = new Company(name, income, employees);
                list.add(ind);
            }

        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        double total = 0;
        for (Payer payer : list){
            System.out.println(payer.getName() + ": $" + String.format("%.2f", payer.imposto()));
            total += payer.imposto();
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", total));




        sc.close();
    }
}