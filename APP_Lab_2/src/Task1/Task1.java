package Task1;

public class Task1 {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(1,2,3);
        Triangle t2 = new Triangle(3,4,5);
        System.out.println(t1.toString());
        t1.checkIsnue();
        t1.setColour("black");
        System.out.println(t1.findArea());
        System.out.println("");
        t2.checkIsnue();
        System.out.println(t2.toString());
        System.out.println(t2.findArea());
        System.out.println(t2.findPerimetr());
        System.out.println("");
        Circle c1 = new Circle(5);
        System.out.println(c1.toString());
    }
}
