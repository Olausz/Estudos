package Q2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = sc.nextInt();

        if (numero % 2 == 1) {
            System.out.println("o numero é impar ");
        } else {
            System.out.println("o numero é par");
        }

    }
}