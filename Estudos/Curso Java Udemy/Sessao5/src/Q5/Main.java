package Q5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean rodar = true;

        double preco_final = 0;
        int quantidade;
        while (rodar == true) {
            System.out.println("Escolha algo pra cume meu fi");
            int escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Digite quanto voce quer");
                quantidade = sc.nextInt();
                preco_final = quantidade * 4.00;
            } else if (escolha == 2) {
                System.out.println("Digite quanto voce quer");
                quantidade = sc.nextInt();
                preco_final = quantidade * 4.50;
            } else if (escolha == 3) {
                System.out.println("Digite quanto voce quer");
                quantidade = sc.nextInt();
                preco_final = quantidade * 5.00;
            } else if (escolha == 4) {
                System.out.println("Digite quanto voce quer");
                quantidade = sc.nextInt();
                preco_final = quantidade * 2.00;
            } else if (escolha == 5 ) {
                System.out.println("Digite quanto voce quer");
                quantidade = sc.nextInt();
                preco_final = quantidade * 1.50;
            }

            System.out.printf("Total: R$ %.2f%n", preco_final);

            System.out.println("Deseja finalizar o pedido?");
            int finalizaco = sc.nextInt();

            if (finalizaco == 1){
                rodar = false;
                System.out.println("Pedido Finalizado");
            }
        }

        sc.close();
    }
}
