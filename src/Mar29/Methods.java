package Mar29;

import java.util.Arrays;
import java.util.Scanner;

// Methods in java
public class Methods {
    static void priceWithTax(int price,int tax){
        System.out.println(price+tax);
    }
    static int priceWithTax2(int price,int tax){
        return price+tax;
    }
    static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+b);
    }
    static int[] swap2(int a,int b){
        return new int[]{b,a};
    }

    static void myVarArgs(int... a){
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        // call by value only in java
        priceWithTax(12, 3);
        System.out.println(priceWithTax2(12,3));
        
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        swap(a,b);
        System.out.println(Arrays.toString(swap2(a,b)));
        System.out.println(a+" "+b);
        myVarArgs(1,2,3,4,5,6,7);
        
    }
}