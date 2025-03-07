package ExercicioMetodosAbstratos;

import ExercicioMetodosAbstratos.Entities.Circle;
import ExercicioMetodosAbstratos.Entities.Enum.Color;
import ExercicioMetodosAbstratos.Entities.Rectangle;
import ExercicioMetodosAbstratos.Entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++){
            System.out.printf("Shape #%d Data\n", i);
            System.out.print("Rectangle or Circle (r/c)? ");
            char rc = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (rc == 'r') {
                System.out.print("Widht: ");
                Double widht = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                list.add(new Rectangle(color, widht, height) {
                });
            } else if(rc == 'c'){
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }

        }
        System.out.println("SHAPE AREAS");
        for (Shape shape : list) {
            System.out.printf("%.2f\n", shape.area());
        }
        sc.close();
    }
}
