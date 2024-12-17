package Q10;

import Q10.Entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final double MEDIA_MINIMA = 6.0;

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        Aluno[] vect = new Aluno[n];

        sc.nextLine();

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados do " + (i + 1) + " Aluno");
            System.out.println("Nome do Aluno: ");
            String nome = sc.nextLine();
            System.out.println("Primeira nota: ");
            double nota1 = sc.nextDouble();
            System.out.println("Segunda nota: ");
            double nota2 = sc.nextDouble();
            System.out.println("");
            sc.nextLine();
            vect[i] = new Aluno(nome, nota1, nota2);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < vect.length; i++){
            if ((vect[i].getNota1() + vect[i].getNota2() ) / 2 >= MEDIA_MINIMA) {
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}