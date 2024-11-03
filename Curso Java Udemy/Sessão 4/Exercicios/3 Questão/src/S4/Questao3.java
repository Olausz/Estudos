package S4;

import java.util.Scanner;

public class Questao3 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, formula;
		
		System.out.println("Digite os valores A, B, C e D para calcular a diferença: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		formula = a * b - c * d;
		
		System.out.printf("DIFERENCA: %d\n", formula);
		
		sc.close();
	}

}
