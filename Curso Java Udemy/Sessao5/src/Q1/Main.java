package Q1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println("Positivo");
        }
    }
}