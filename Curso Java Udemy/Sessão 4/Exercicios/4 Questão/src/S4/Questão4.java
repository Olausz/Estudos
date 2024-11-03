package S4;

import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number, hours;
		double valor_hours, salary;
		
		System.out.println("Worker Number: ");
		number = sc.nextInt();
		
		System.out.println("Hours  Worked: ");
		hours = sc.nextInt();
		
		System.out.println("How much get paid per hour?: ");
		valor_hours = sc.nextDouble();
		
		
		salary = valor_hours * hours;
		
		System.out.printf("NUMBER = %d", number);
		System.out.printf("%n");
		System.out.printf("SALARY = U$ %.2f", salary);
		
		sc.close();
		
	}

}
