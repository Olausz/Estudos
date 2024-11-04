package Parte4.Q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos valors serão inseridos: ");
        int valorN = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i=0; i < valorN; i++){
            int valorX = sc.nextInt();
            if (valorX >= 10 && valorX <= 20){
                in = in + 1;
            }
            else {
                out = out + 1;
            }
        }

        System.out.printf("Valores dentro do intervalo %d: %n", in);
        System.out.printf("Valores fora do intervalo %d: ", out);

        sc.close();
    }
}