package Q9;
import Q9.Entidades.PessoaQ9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        PessoaQ9 [] vect = new PessoaQ9[n];

        sc.nextLine();

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da "+ (i + 1) +" pessoa");
            System.out.println("Digite o nome da pessoa " + (i + 1));
            String nome = sc.nextLine();
            System.out.println("Digite a idade da pessoa "+(i + 1));
            int idade = sc.nextInt();
            System.out.println("");
            sc.nextLine();
            vect[i] = new PessoaQ9(nome, idade);
        }

        int controle = vect[0].getIdade();
        String nome_MaisVelho = vect[0].getNome();
        for (int i = 0; i < vect.length; i++){
            if (vect[i].getIdade() > controle){
                controle = vect[i].getIdade();
                nome_MaisVelho = vect[i].getNome();
            }
        }

        System.out.printf("Pessoa mais velha é %s", nome_MaisVelho);



    }
}