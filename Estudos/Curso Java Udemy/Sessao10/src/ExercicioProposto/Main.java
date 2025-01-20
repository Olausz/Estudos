package ExercicioProposto;

import ExercicioProposto.Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean control = true;
        boolean control2 = true;

        List<Employee> list = new ArrayList<>();

        while (control != false){
            int number = 0;
            System.out.printf("Employee Number #%d\n",number + 1);
            System.out.println("Employee id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Employee name: ");
            String name = sc.nextLine();
            System.out.println("Employee Salary");
            Double salary = sc.nextDouble();
            sc.nextLine();

            list.add(new Employee(id, name, salary));

            System.out.println("Want to stop adding new employees? Yes or no");
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase("yes")) {
                control = false;
            }
        }

        while (control2 != false) {
            System.out.println("Do you want to increase the salary of a Employee?");
            String confirm2 = sc.nextLine();
            if (confirm2.equalsIgnoreCase("no")) {
                control2 = false;
            }

            System.out.println("Enter the Employee id that will have the salary increase");
            Integer Id_Search = sc.nextInt();
            Employee emp = null;
            for (Employee e : list){
                if(e.getId() == Id_Search){
                    emp = e;
                    break;
                }
            }

            if (emp != null){
                System.out.println("Enter the percentage");
                double percentage = sc.nextDouble();
                emp.Salary_Increase(percentage);
                System.out.println("new salary received!");
            }

            for (Employee e : list){
                System.out.printf("%d, %s, %.2f \n", e.getId(), e.getName(), e.getSalary());
            }
            sc.nextLine();
            System.out.println("End?");
            String confirm3 = sc.nextLine();
            if (confirm3.equalsIgnoreCase("yes")){
                control2 = false;
            }

        }
        System.out.println("Cya space cowboy");
        sc.close();
    }
}