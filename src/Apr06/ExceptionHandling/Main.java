package Apr06.ExceptionHandling;

// import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)/*throws Exception*/{
        // Exception Handling
        // Something goes wrong during execution
        //  -unexpected behaviour
        //  -abnormal termination

        // Errors can not be tackled
        // Exceptions can be handled
        // Throwable - Interface
        // Exception implements Throwable
        // 1. IOException
        // 2. RunTimeException
        Scanner sc=new Scanner(System.in);
        // try {
        //     System.out.print("Enter test score: ");
        //     int score=sc.nextInt();
        //     if(score>=50){
        //         System.out.println("You have a place on the course!");
        //     }else{
        //         System.out.println("Sorry! You failed the test.");
        //     }
        // } catch (InputMismatchException e) {
        //     System.out.print("Invalid input!");
        // }catch(Exception e){
        //     // Multiple catch stmts can be uesd
        //     System.out.println(e);
        // }

        double side=sc.nextInt();
        Square s;
        try{//other 
            s=new Square(side);
            System.out.println(s.calculateArea());
        }catch(Exception e){
            System.out.println("Invalid value!");
        }
        sc.close();
    }
}
