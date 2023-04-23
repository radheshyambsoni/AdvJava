package Apr10;

class A extends Thread{

    @Override
    public void run() {
        System.out.println("Starting thread A....");
        for(int i=1;i<=5;i++){
            // if(i==2){
            //     Thread.yield();
            // }
            System.out.println("From Thread A: i= "+i);
        }
        System.out.println("...Exit Thread A");
    }
    
}

class B extends Thread{
    @Override
    public void run() {
        System.out.println("Starting thread B....");
        for(int i=1;i<=5;i++){
            if(i==2){
                // try{
                //     join();
                // }catch(Exception e){
                //     System.out.println();
                // }
            }
            System.out.println("From Thread B: j= "+i);
        }
        System.out.println("...Exit Thread B");
    }
}

class C implements Runnable{
    @Override
    public void run() {
        System.out.println("Starting thread C....");
        for(int i=1;i<=5;i++){
            // if(i==3){
            //     try{
            //         Thread.sleep(1000);
            //     }catch(Exception e){
            //         System.out.println(e);
            //     }
            // }
            System.out.println("From Thread B: k= "+i);
        }
        System.out.println("...Exit Thread C");
    }
}

public class ThreadsInJava {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        Thread c=new Thread(new C());

        a.start();
        b.start();
        c.start();
        System.out.println("End of program!");
    }
}
