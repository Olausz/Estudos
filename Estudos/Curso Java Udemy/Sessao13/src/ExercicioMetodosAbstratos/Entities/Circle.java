package ExercicioMetodosAbstratos.Entities;

import ExercicioMetodosAbstratos.Entities.Enum.Color;

public class Circle extends Shape {

    private Double radius;

    public Circle(){
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
