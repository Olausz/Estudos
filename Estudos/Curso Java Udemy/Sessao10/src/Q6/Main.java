package Q6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int [] vectA = new int[n];
        int [] vectB = new int[n];
        int [] vectC = new int[n];

        System.out.println("Digite os Valores do vetor A: ");
        for (int i = 0; i< vectA.length; i++) {
            vectA[i] = sc.nextInt();
        }

        sc.nextLine();

        System.out.println("Digite os Valores do vetor B: ");
        for (int i = 0; i< vectB.length; i++) {
            vectB[i] = sc.nextInt();
        }

        for (int i = 0; i< vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }

        System.out.println("VETOR RESULTANTE: ");

        for (int i = 0; i< vectC.length; i++) {
            System.out.println(vectC[i]);
        }

    }
}