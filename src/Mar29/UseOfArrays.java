package Mar29;

import java.util.Scanner;

public class UseOfArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int[] marks=new int[n];
        int total=0;
        System.out.print("Enter marks of 5 subjects seperated by space: ");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
        sc.close();

        System.out.print("Marks: ");
        for(int i:marks){
            System.out.print(i+" ");
        }
        System.out.println("\nTotal: "+total);
        System.out.println("Average: "+((double)total/5));
        System.out.println("Result: "+(((double)total/5))+"%");
    }
}