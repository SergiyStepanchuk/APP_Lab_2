package Task1;

public class Square extends Figure {


    private double a; // storona


    @Override
    public double findArea() {
        return a*a;
    }

    @Override
    public double findPerimetr() {
        return a*4;
    }
    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String toString(){
        return ("Колiр: " + colour +  " " + "Сторона а: " + a + " ");
    }
    Square(double a){
        this.a = a;
    }
}

