package Q6;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para verifiação: ");
        double valor = sc.nextDouble();


        if (valor <= 25.00) {
            System.out.println("intervalo (0,25]");
        } else if (valor <= 25.50) {
            System.out.println("intervalo (25,50]");
        } else if (valor > 50.00 && valor <= 75.00) {
            System.out.println("intervalo (50, 75]");
        } else if (valor > 75.00) {
            System.out.println("intervalo (75, 100]");
        } else {
            System.out.println("valor fora de intervalo");
        }

        sc.close();
    }
}