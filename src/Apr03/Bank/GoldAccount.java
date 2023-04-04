package Apr03.Bank;

public class GoldAccount extends BankAccount {
    double overdraftLimit;
    public GoldAccount(String accNum, String accName, double bal,double odl) {
        super(accNum, accName, bal);
        this.overdraftLimit=odl;
    }
    public boolean withdraw(double amt){
        if(amt>=-overdraftLimit){
            System.out.println("Successfully debited amount: "+amt);
            System.out.println("Current Balance: "+this.getBal());
            this.setBal(this.getBal()-amt);
            return true;
        }else{
            System.out.println("Insufficient Balance");
            return false;
        }
    }
}
