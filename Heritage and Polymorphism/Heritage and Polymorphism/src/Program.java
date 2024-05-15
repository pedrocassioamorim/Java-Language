import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import entities.SavingsAccountPlus;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Account acc1 = new SavingsAccount(1001, "Alex", 1000.0, 2000.0);
        acc1.withdraw(200);
        // System.out.println(acc1.getBalance());

        Account acc2 = new SavingsAccount(1002, "Pedro", 1000.0, 0.01);
        acc2.withdraw(200);
        // System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withdraw(200);
        // System.out.println(acc3.getBalance());

        Account acc4 = new BusinessAccount(1004, "Lucas", 3000.0,5000.0);
        Account acc5 = new SavingsAccount (1006, "Mario", 3000.0, 0.02);

        acc4.withdraw(50);
        acc5.withdraw(50);

        List<Account> list = new ArrayList<>();

        list.add(acc1);
        list.add(acc2);
        list.add(acc3);
        list.add(acc4);
        list.add(acc5);

        double soma = 0;
        for (Account acc : list){
            soma += acc.getBalance();
        }

        System.out.println("Total Value: " + soma);

        for (Account acc : list){
            acc.deposit(15000);
        }

        for (Account acc : list){
            System.out.println("Updated balance for account: #" + acc.getNumber() + ": $" + acc.getBalance());
        }
    }
}