package Mar29;

import java.util.Scanner;

public class ScannerClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        int tax=sc.nextInt();
        sc.close();
        System.out.println(tax+price);
    }
}