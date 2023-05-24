package Apr06.ExceptionHandling;

public class Square extends Exception{
    private double side;

    public Square(double side) throws Exception{
        if(side<=0){
            throw new Exception("Invalid Value!");
        }else{
            this.side=side;
        }
    }

    public Square(){
        super("Custome error msg");
    }
    
    public double calculateArea(){
        return this.side*this.side;
    }
}