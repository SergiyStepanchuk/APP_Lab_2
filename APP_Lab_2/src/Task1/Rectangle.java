package Task1;

public class Rectangle extends Figure {

    private double a; //storony
    private double b;


    @Override
    public double findArea() {
     return  a*b;
    }

    @Override
    public double findPerimetr() {
      return (a+b)*2;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String toString(){
        return ("Колiр: " + colour +  " " + "Сторона а: " + a + " " + "Сторона b: " + b + " ");
    }
    Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
}
