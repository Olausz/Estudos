package ExercicioMetodosAbstratos.Entities;

import ExercicioMetodosAbstratos.Entities.Enum.Color;

public abstract class Rectangle extends Shape {

    private Double widht;
    private Double height;

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Rectangle() {
    }

    public Rectangle(Color color, Double widht, Double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    @Override
    public double area() {
        return height * widht;
    }
}
