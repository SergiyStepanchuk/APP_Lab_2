package Task1;

public class Triangle extends Figure {

    private double a; // storony
    private double b;
    private double c;
    private boolean isnue = false;

    public void checkIsnue(){
    if ((a+b)>c && (a+c)>b && (b+c)>a )
        isnue = true;
    else
        System.out.println("Такого трикутника не iснує!");
    }


    @Override
    public double findArea() {
        double p = (a+b+c)/2; // poluperymetr
        if (isnue == true)
            return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // formula Gerona
            else {
            System.out.println("Помилка змiнiть значеня сторон");
            return -1;}
    }

    @Override
    public double findPerimetr() {
        if (isnue == true)
        return a+b+c;
        else {
            System.out.println("Помилка змiнiть значеня сторон");
            return -1;}
    }

    @Override
    public void setColour(String colour) {
        super.setColour(colour);
    }
    public String toString(){
        return ("Колiр: " + colour +  " " + "Сторона а: " + a + " " + "Сторона b: " + b + " " + "Сторона с: " + c );
    }
    Triangle(double a,double b,double c){
            this.a = a;
            this.b = b;
            this.c = c;
    }
}




