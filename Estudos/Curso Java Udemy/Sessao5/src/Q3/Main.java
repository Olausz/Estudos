package Q3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo numero");
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0){
            System.out.println("São Multiplos");
        }
        else if (numero2 % numero1 == 0){
            System.out.println("São Multiplos");
        }
        else {
            System.out.println("Não são Multiplos");
        }
    }
}