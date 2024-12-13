package Q4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos numeros serão inseridos: ");
        int n = sc.nextInt();
        int [] vect = new int[n];


        for (int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int pares_quant = 0;

        System.out.println("\nnumeros pares: ");

        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0 ) {
                pares_quant++;
                System.out.println(vect[i]);
            }
        }

        System.out.printf("quantidade de pares =  %d\n", pares_quant);
    }
}