package Mar31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // pass j,i,q to move left/right, up/down and quit resp. in 8 x 8 matrix
        MovePosition o=new MovePosition(7,1);
        System.out.println("The initial 8 x 8 looks like this:");
        o.display();

        Scanner sc=new Scanner(System.in);
        System.out.print("Do you want to change position? (y/n) ");
        char q=sc.next().charAt(0);
        int x=7,y=1;
        while(q=='y'){
            System.out.print("Enter change in x: ");
            int i=sc.nextInt();
            System.out.print("Enter change in y: ");
            int j=sc.nextInt();
            if(o.move(o.matrix,i,j,x,y)){
                x+=i;
                y+=j;
            }
            System.out.print("\nDo you want to go again? (y/n) ");
            q=sc.next().charAt(0);
        }
        sc.close();
    }
}