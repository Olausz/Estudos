package Q4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int duracao;

        System.out.println("Digite a hora de inicio do jogo");
        int horaInicial = sc.nextInt();

        System.out.println("Digite a hora do final do jogo");
        int horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("tempo de duração: " + duracao + "Horas");


    }
}