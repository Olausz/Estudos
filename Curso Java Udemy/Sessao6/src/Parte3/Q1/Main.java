package Parte3.Q1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;

        do {
            int Senha = sc.nextInt();
            if (Senha != 2022){
                System.out.println("Senha Invalida");
            }
            else {
                System.out.println("Acesso permitido");
                check = false;
            }
        } while (check == true);

        sc.close();
    }
}