package Apr10;

class Account{
    private double bal;
    private String accNum;  
    
    public Account(double bal, String accNum) {
        this.bal = bal;
        this.accNum = accNum;
    }
    void displayBal(){
        System.out.println("Current Balance for account number: "+accNum+" is "+bal);
    }
    synchronized void deposit(double amt){
        bal+=amt;
    }
    synchronized void withdraw(double amt){
        bal-=amt;
    }
}

class TransDeposit implements Runnable{
    double amt;
    Account acc;
    
    public TransDeposit(Account acc,double amt) {
        this.amt = amt;
        this.acc = acc;
        new Thread(this).start();
    }

    @Override
    public void run() {
        acc.deposit(amt);
        acc.displayBal();
    }
}

class TransWithdraw implements Runnable{
    double amt;
    Account acc;
    
    public TransWithdraw(Account acc,double amt) {
        this.amt = amt;
        this.acc = acc;
        new Thread(this).start();
    }

    @Override
    public void run() {
        acc.withdraw(amt);
        acc.displayBal();
    }
}

public class SynchronizationInJava {
    public static void main(String[] args) {
        Account acc=new Account(1000, "10994");
        TransWithdraw tw=new TransWithdraw(acc, 300);
        TransDeposit td=new TransDeposit(acc,200);
    }
}
