package Apr06.ExceptionHandling;

public class Square {
    private double side;

    public Square(double side) throws Exception{
        if(side<=0){
            throw new Exception("Invalid Value!");
        }else{
            this.side=side;
        }
    }
    public double calculateArea(){
        return this.side*this.side;
    }
}