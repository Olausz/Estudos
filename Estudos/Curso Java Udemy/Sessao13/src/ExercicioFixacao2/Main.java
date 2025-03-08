package ExercicioFixacao2;


import ExercicioFixacao2.Entities.Company;
import ExercicioFixacao2.Entities.Individual;
import ExercicioFixacao2.Entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        Integer number = sc.nextInt();
        for (int i = 1; i <= number; i++){
            System.out.printf("Tax payer #%d Data:\n", i);
            System.out.print("Individual or Company (i/c)?");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            if (type == 'c') {
                System.out.print("Number of Employees: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }else if (type == 'i') {
                System.out.print("Health Expenditure: ");
                Double healthExpenditure = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditure));
            }
        }

        System.out.println("TAXES PAID: ");
        Double sum = 0.0;
        for (TaxPayer taxPayer : list) {
            if (taxPayer instanceof Individual) {
                double tax;
                if (taxPayer.getAnualIncome() < 20000) {
                    tax = taxPayer.tax(0.15);
                } else {
                    tax = taxPayer.tax(0.25);
                }
                System.out.printf("%s: $ %.2f\n", taxPayer.getName(), tax);
                sum += tax;
            } else if (taxPayer instanceof Company) {
                Company company = (Company) taxPayer;
                double tax;
                if (company.getNumberOfEmployers() > 10) {
                    tax = company.tax(0.14);
                } else {
                    tax = company.tax(0.16);
                }
                System.out.printf("%s: $ %.2f\n", company.getName(), tax);
                sum += tax;
            }
        }
        System.out.println("Total Taxes: $ " + String.format("%.2f", sum));
        sc.close();
    }
}
