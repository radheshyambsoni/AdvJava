package Apr07;

class ThreadA extends Thread {
    public void run(){        
        for(int i=1;i<=5;i++){
            System.out.println("From thread A with i="+(-i));
        }
        System.out.println("Exiting from thread A...");
    }
}
class ThreadB extends Thread {
    public void run(){
        for(int j=1;j<=5;j++){
            System.out.println("\tFrom thread B with j="+2*j);
        }
        System.out.println("\tExiting from thread B...");
    }
}

class ThreadC extends Thread {
    public void run(){
        for(int k=1;k<=5;k++){
            System.out.println("\t\tFrom thread B with k="+(2*k-1));
        }
        System.out.println("\t\tExiting from thread C...");
    }
}

class ThreadZ implements Runnable{

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("\t\t\tValue of Z with runnable interface: "+i);
        }
        System.out.println("Exiting ThreadZ...");
    }    
}

public class MultiThreading{
    public static void main(String[] args) {
        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB();
        ThreadC c=new ThreadC();
        a.start();
        b.start();
        c.start();

        Thread t=new Thread(new ThreadZ());
        t.start();
        
        System.out.println("....Multithreading is over....");
    }
}