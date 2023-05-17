package Mar29;

import java.util.Scanner;

public class ScannerClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price amount: ");
        int price=sc.nextInt();
        System.out.println("Enter the tax amount: ");
        int tax=sc.nextInt();
        sc.close();
        System.out.println("MRP: "+(tax+price));
    }
}