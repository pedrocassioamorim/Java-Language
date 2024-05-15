import services.BrazilInterestService;
import services.InterestService;
import services.USAInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Amount: ");
        Double amount = sc.nextDouble();

        System.out.print("Months: ");
        Integer months = sc.nextInt();

        InterestService bs = new BrazilInterestService(2.0);
        InterestService us = new USAInterestService(3.0);

        double paymentBR = bs.payment(amount, months);
        double paymentUSA = us.payment(amount, months);


        System.out.println("Payment after " + months + " months:");
        System.out.println("Brazil: " + String.format("%.2f", paymentBR));
        System.out.println("USA: " + String.format("%.2f", paymentUSA));






        sc.close();

    }
}