package Mar29;

import java.util.Scanner;

public class UseOfArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int[] marks=new int[n];
        int total=0;
        System.out.println("Enter marks of 5 subjects seperated by space: ");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
        sc.close();

        System.out.println("Marks: ");
        for(int i:marks){
            System.out.print(i+" ");
        }
        System.out.println("Total: "+total);
        System.out.println("Average: "+(total/5));
        System.out.println("Result: "+((total/5)*100)+"%");
    }
}