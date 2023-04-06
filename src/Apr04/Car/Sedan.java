package Apr04.Car;

public class Sedan implements CarInt {
    private String companyName;
    private double price;
    
    public Sedan(String companyName, double price) {
        this.companyName = companyName;
        this.price = price;
    }
    @Override
    public void media(){
        System.out.println("Playing media...");
    }
    @Override
    public void accelerate() {
        System.out.println("accelerating...");
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
