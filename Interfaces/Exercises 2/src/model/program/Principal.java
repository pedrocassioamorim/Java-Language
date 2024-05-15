package model.program;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Entre os dados do Contrato: ");
        System.out.println("Numero: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(), sdf);

        System.out.println("Valor do Contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(numero, date, totalValue);

        System.out.println("Entre o numero de parcelas: ");
        int installment = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installment);

        System.out.println("Parcelas: ");
        for (Installment installment1 : contract.getInstallmentList()){
            System.out.println(installment1);
        }

        sc.close();
    }
}