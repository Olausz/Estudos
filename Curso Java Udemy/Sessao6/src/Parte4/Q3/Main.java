package Parte4.Q3;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        System.out.println("Digite o quantidade de numeros: ");
        int valorN = sc.nextInt();

        for (int i=0; i < valorN;i++){
            double num1 = sc.nextDouble();
            double num2 = sc.nextDouble();
            double num3 = sc.nextDouble();

            double mediaPonderada = (num1 * 2.0 ) + (num2 * 3.0) + (num3 * 5.0) / 10;
            System.out.printf("%.1%n", mediaPonderada);
        }

        sc.close();
    }
}