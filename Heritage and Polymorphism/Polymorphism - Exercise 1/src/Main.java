import entities.Employee;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Employee> list = new ArrayList<>();


        System.out.println("How many Employees?");
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i++){
            System.out.println("Dados do Funcionário #" + (i+1) + ":");
            System.out.print("Outsourced? (y/n)");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per Hour: ");
            double valuePerHours = sc.nextDouble();
            if (ch == 'y'){
                System.out.println("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutSourcedEmployee(name, hours, valuePerHours, additionalCharge);
                list.add(emp);
            }
            else {
                Employee emp = new Employee(name,hours,valuePerHours);
                list.add(emp);
            }



        }


        System.out.println();
        System.out.println("Payments: ");
        for (Employee emp : list){
            System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}