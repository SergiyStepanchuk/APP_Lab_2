package Task1;

public class Circle extends Figure {

    private double r; // radius
    @Override
    public double findArea() {
        return pi * r * r ;
    }

    @Override
    public double findPerimetr() {
        return 2 * pi *r;
    }
    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String toString(){
        return ("Колiр: " + colour +  " " + "Радiус: " + r + " ");
    }
    Circle(double r){
        this.r = r;
    }
}
