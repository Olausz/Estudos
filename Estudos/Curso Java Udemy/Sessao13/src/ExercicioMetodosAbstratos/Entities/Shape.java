package ExercicioMetodosAbstratos.Entities;

import ExercicioMetodosAbstratos.Entities.Enum.Color;

public abstract class Shape {

    private Color color;

    public Shape(Color color){
        this.color = color;
    }

    public Shape(){

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
