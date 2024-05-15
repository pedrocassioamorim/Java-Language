import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String path = "/home/amorim/IdeaProjects/Programacao_funcional_Expressoes_Lambda/Streams_Exerc_FIX/src/file.txt";

        List<Employee> list = new ArrayList<>();


        // Artigo sobre Streams - Muito bom!
        // https://www.oracle.com/br/technical-resources/articles/java-stream-api.html



        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.println("Enter the salary: ");
            double salary = sc.nextDouble();

            List<String> emails = list.stream()
                    .filter(p -> p.getSalary() > salary)
                    .map(p -> p.getEmail())
                    .collect(Collectors.toList());

            System.out.println("Email of people whose salary is more than " + salary + ":");
            for (String email : emails){
                System.out.println(email);
            }

            double soma = list.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(p -> p.getSalary())
                    .reduce(0.0, (x,y) -> x+y);

            System.out.println("Sum of salary of whose name starts with 'M' : " + String.format("%.2f", soma));


        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}