package Parte4.Q1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        for (int i=1; i < numero; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }else if (numero % 2 == 1){
                System.out.println(numero);
            }
        }
        sc.close();
    }
}