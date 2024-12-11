package Q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i< vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for(int i = 0; i < vect.length; i++){
            soma += vect[i];
        }

        double media = soma / vect.length;

        System.out.println("Valores: ");

        for(int i = 0; i < vect.length; i++){
            System.out.print(vect[i] + " ");
        }

        System.out.println("");

        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = "+ media);


    }
}