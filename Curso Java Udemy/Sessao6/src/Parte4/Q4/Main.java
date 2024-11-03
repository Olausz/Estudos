package Parte4.Q4;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        System.out.println("Digite o quantidade de numeros: ");
        int valorN = sc.nextInt();

        for (int i= 0; i < valorN; i++){
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();

            if (num2 == 0) {
                System.out.println("divisão impossível");
            } else {
                double divisao = num1 / num2;
                System.out.println(divisao);
            }
        }
        sc.close();
    }
}