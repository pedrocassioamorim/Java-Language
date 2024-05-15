import model.entities.*;
import model.exceptions.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Account Data: ");
            System.out.println("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.println("Holder: ");
            String holder = sc.nextLine();
            System.out.println("Initial Balance: ");
            double balance = sc.nextDouble();
            System.out.println("Withdraw Limit: ");
            double withdrawLimit = sc.nextDouble();
            System.out.println();
            System.out.println();
            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println("Enter amount to withdraw: ");
            double amountToWithdraw = sc.nextDouble();

            account.withdraw(amountToWithdraw);

            System.out.println();
            System.out.println("Final balance: " + account.getBalance());

        }
        catch (InsuficientBalanceException | InsuficientWithdrawLimitException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected Error");
        }

        sc.close();
    }
}