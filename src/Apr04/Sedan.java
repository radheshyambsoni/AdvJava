package Apr04;

public class Sedan implements Car {
    private String companyName;
    private int price;
    
    public Sedan(String companyName, int price) {
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
