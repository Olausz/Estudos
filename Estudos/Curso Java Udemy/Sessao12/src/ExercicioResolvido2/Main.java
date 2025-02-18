package ExercicioResolvido2;

import ExercicioResolvido2.Entites.Comment;
import ExercicioResolvido2.Entites.Post;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Comment c1 = new Comment("Have a nice trio!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(12, "Im going to travel to this wonderful country!", "Traveling to new Zealand!", sdf.parse("21/06/2018 13:45:06"));

        p1.addComments(c1);
        p1.addComments(c2);

        System.out.println(p1);
        sc.close();
    }
}