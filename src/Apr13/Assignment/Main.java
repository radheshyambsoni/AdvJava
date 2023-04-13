package Apr13.Assignment;

import Apr13.Circle.Circle;

public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(5);
        System.out.println("Radius of circle: "+c.getRadius());
        System.out.println("Area of circle: "+c.calculateArea()+" sq. units");
        System.out.println("Circumference of circle: "+c.calculateCircumference()+" units");
        
        System.out.println();
        Circle c1=new Circle(-3);
        System.out.println("Radius of circle: "+c1.getRadius());
        System.out.println("Area of circle: "+c1.calculateArea()+" sq. units");
        System.out.println("Circumference of circle: "+c1.calculateCircumference()+" units");
    }
}