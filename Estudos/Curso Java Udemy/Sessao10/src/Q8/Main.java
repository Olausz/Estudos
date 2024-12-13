package Q8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int [] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int soma_pares = 0;
        int quant_pares = 0;
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                soma_pares += vect[i];
                quant_pares++;
            }
        }



        if (quant_pares > 0) {
            int media_pares = soma_pares / quant_pares;
            System.out.printf("\nNo vetor existem %d pares", quant_pares);
            System.out.printf("\nA Media dos pares = %d", media_pares);
        }
        else {
            System.out.println("NENHUM PAR ");
        }


    }
}