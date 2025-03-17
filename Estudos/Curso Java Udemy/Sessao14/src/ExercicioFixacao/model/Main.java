package ExercicioFixacao.model;

import ExercicioFixacao.model.Entities.Account;
import ExercicioFixacao.model.Exception.AcimaLimite;
import ExercicioFixacao.model.Exception.SemSaldo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println("Enter Account Data");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            System.out.print("Holder: ");
            sc.next();
            String holder = sc.nextLine();
            System.out.print("Initial Balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw Limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();

            account.withdraw(amount);
        }
        catch (SemSaldo e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (AcimaLimite e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }
}