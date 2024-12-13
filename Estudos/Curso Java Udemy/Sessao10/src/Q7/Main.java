package Q7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int n = sc.nextInt();
        double [] vect = new double [n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < vect.length; i++){
            soma += vect[i];
        }

        double media = soma / vect.length;

        System.out.printf("\nMedia do vetor = %.3f", media);
        System.out.println("\nELEMENTOS ABAIXO DA MEDIA :");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] < media){
                System.out.println(vect[i]);
            }
        }
    }
}