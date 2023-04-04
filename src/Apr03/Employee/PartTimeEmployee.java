package Apr03.Employee;

public class PartTimeEmployee extends Employee{
    double hrlyPay;
    PartTimeEmployee(String id,String fname,String lname,double hrlyPay){
        super(id, fname, lname);
        this.hrlyPay=hrlyPay;
    }
    public double getHrlyPay() {
        return hrlyPay;
    }
    public void setHrlyPay(double hrlyPay) {
        this.hrlyPay = hrlyPay;
    }
    public double calculateWeeklyPay(int hrs){
        return this.hrlyPay*hrs;
    }    
}