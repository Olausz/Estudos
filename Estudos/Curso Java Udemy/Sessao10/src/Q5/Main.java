package Q5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }


        double maior_numero = 1.0;
        int posicao_maior = 1;
        for (int i = 0; i < vect.length; i++){
            if (maior_numero < vect[i]){
                maior_numero = vect[i];
                posicao_maior = i;
            }
        }

        System.out.printf("MAIOR VALOR: %.2f%n", maior_numero);
        System.out.printf("POSIÇÃO DO MAIOR: %d%n", posicao_maior);


    }
}