package S4;


import java.util.Scanner;

public class Questao2 {
	
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		double raio, area, pi;
		
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextDouble();
		
		pi = 3.14159;
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("A = %.4f\n", area);
		
		sc.close();
		
	}

}
