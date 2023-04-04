package Apr03.Bank;

public class BankAccount {
    private String accNum,accName;
    private double bal;
    public BankAccount(String accNum, String accName, double bal) {
        this.accNum = accNum;
        this.accName = accName;
        this.bal = bal;
    }
    public String getAccNum() {
        return accNum;
    }

    public void deposit(double amt){
        this.bal+=amt;
    }
    public boolean withdraw(double amt){
        if(amt>this.bal){
            System.out.println("Insufficient Balance!");
            return false;
        }else{
            System.out.println("Successfully debited amount: "+amt);
            System.out.println("Current Balance: "+this.getBal());
            return true;
        }
    }

    public String getAccName() {
        return accName;
    }
    
    public double getBal() {
        return bal;
    }
    
    protected void setBal(double bal) {
        this.bal = bal;
    }
}