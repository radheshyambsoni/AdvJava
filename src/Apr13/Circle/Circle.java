package Apr13.Circle;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if(radius<0){
            System.out.println("Invalid radius value!");
            System.out.println("Default radius will be set to 0.");
            this.radius = 0;
        }else{
            this.radius = radius;
        }
    }

    public double calculateArea(){
        return Math.PI*radius*radius;
    }

    public double calculateCircumference(){
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }
}
