package Parte3.Q3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean check = true;

        int Alcool = 0;
        int Gasolina = 0;
        int Diesel = 0;

        System.out.println("Digite qual tipo de Combustivel voce deseja, 1 - Álcool / 2 - Gasolina / 3 - Diesel / 4 - Sair");

        do {
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Você escolheu Álcool!");
                    Alcool = Alcool + 1;
                    break;
                case 2:
                    System.out.println("Você escolheu Gasolina!");
                    Gasolina = Gasolina + 1;
                    break;
                case 3:
                    System.out.println("Você escolheu Diesel!");
                    Diesel = Diesel + 1;
                    break;
                case 4:
                    System.out.println("Muito Obrigado!");
                    System.out.printf("Álcool: %d %n",Alcool);
                    System.out.printf("Gasolina: %d %n",Gasolina);
                    System.out.printf("Diesel: %d %n",Diesel);
                    check = false;
                    break;
                default:
                    System.out.println("Código inválido, informe outro Código!");
                    break;
            }

        } while(check == true);

        sc.close();

    }
}