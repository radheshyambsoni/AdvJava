package Mar29;

import java.util.Scanner;

public class PrintRectangleUsingStars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Please Enter Number of Rows : ");
        int rows=sc.nextInt();

        System.out.print("Please Enter Number of Columns : ");
        int cols=sc.nextInt();
        sc.close();

        for (int i=1; i<=rows; i++) {
            for (int j=1; j<=cols; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}