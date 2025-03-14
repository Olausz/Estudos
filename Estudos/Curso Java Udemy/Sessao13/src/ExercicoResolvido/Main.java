package ExercicoResolvido;

import ExercicoResolvido.Entities.Employee;
import ExercicoResolvido.Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: \n");
        int number = sc.nextInt();
        for (int i=1; i <= number; i++){
            System.out.printf("Employee #%d data \n", i);
            System.out.print("Outsourced (y/n)?");
            char source = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (source == 'y') {
                System.out.println("Additional Charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("\n");
        System.out.println("Payments");
        for (Employee emp : list) {
            System.out.printf("%s - $ %.2f \n", emp.getNome(), emp.payment());
        }

    }
}