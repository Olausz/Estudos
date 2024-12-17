package Q11;

import Q11.Entidades.PessoaQ11;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        PessoaQ11[] vect = new PessoaQ11[n];
        int quant_Mulheres = 0;
        int quant_Homens = 0;

        sc.nextLine();

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa");
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.println("Sexo: ");
            String sexo = sc.nextLine();
            vect[i] = new PessoaQ11(sexo, altura);
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getSexo().equalsIgnoreCase("F")) {
                quant_Mulheres++;
            } else if (vect[i].getSexo().equalsIgnoreCase("M")) {
                quant_Homens++;
            } else {
                System.out.println("Sexo da pessoa não existe");
            }
        }

        double soma_AlturaMulheres = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getSexo().equals("F") || vect[i].getSexo().equals("f")) {
                soma_AlturaMulheres += vect[i].getAltura();
            }
        }

        double media = soma_AlturaMulheres / quant_Mulheres;

        double maior_altura = vect[0].getAltura();
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAltura() > maior_altura) {
                maior_altura = vect[i].getAltura();
            }
        }

        double menor_altura = vect[0].getAltura();
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAltura() < menor_altura) {
                menor_altura = vect[i].getAltura();
            }
        }

        System.out.printf("Menor altura = %.2f \n", menor_altura);
        System.out.printf("Maior altura = %.2f \n", maior_altura);
        System.out.printf("Media da altura das mulheres = %.2f\n", media);
        System.out.printf("Numero de homens = %d\n", quant_Homens);
    }
}