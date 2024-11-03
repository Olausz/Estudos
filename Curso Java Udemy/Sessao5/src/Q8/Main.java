package Q8;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salario");
        double salario = sc.nextDouble();


        if (salario <= 2000) {
            System.out.println("isento de imposto");
        } else if (salario > 2001 && salario < 3000){
            System.out.println("8% de imposto");
            double faixa1 = (salario - 2000) * 0.08;
            System.out.printf("imposto: %.2f reais%n", faixa1);
        } else if (salario > 3001 && salario < 4500) {
            System.out.println("18% de imposto");
            double faixa1 = 1000 * 0.08;
            double faixa2 = (salario - 3000) * 0.18;
            double imposto_final = faixa1 + faixa2;
            System.out.printf("imposto: %.2f reais%n", imposto_final);
        } else {
            System.out.println("imposto de 28%");
            double faixa1 = 1000 * 0.08;
            double faixa2 = 1500 * 0.18;
            double faixa3 = (salario - 4500) * 0.28;
            double imposto_final = faixa1 + faixa2 + faixa3;
            System.out.printf("imposto: %.2f reais%n", imposto_final);
        }
    }
}
