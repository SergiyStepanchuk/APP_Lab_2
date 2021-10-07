package Task1;

public class Figure {

     public final double pi = 3.1415; // constanta 4yslo pi
     protected String colour = "white";
     public double findPerimetr(){
          System.out.println("Perimetr!");
          return  0;
     };
    public double findArea(){
         System.out.println("Area!");
         return 0;
     };
     public void setColour(String colour){
          this.colour = colour;
     };
    public String toString(){
        return ("Колiр:" + colour);
    }
}
