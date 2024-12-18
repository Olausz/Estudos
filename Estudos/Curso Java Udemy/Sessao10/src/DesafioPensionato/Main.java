package DesafioPensionato;

import DesafioPensionato.Entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno[] vect = new Aluno[10];

        System.out.print("How many rooms will be rented? ");
        int students = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < students; i++) {
            System.out.printf("Rent #%d\n", (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            vect[room - 1] = new Aluno(name, email, room);
        }

        System.out.println("Busy Rooms:");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.printf("%d: %s, %s\n", vect[i].getRoom(), vect[i].getName(), vect[i].getEmail());
            }
        }
    }
}
