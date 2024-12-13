package Q3;
import Q3.Entidades.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas no sistema? ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i + 1) +"a pessoa");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.println(" ");
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.println(" ");
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
        }

        double soma = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();
        }
        double media = soma / vect.length;

        int menos_16 = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                menos_16 ++;
            }
        }

        double porcentagem = (menos_16 * 100.0) / vect.length;


        System.out.printf("Altura media %.2f metros%n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.2f %% %n", porcentagem);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

    }
}