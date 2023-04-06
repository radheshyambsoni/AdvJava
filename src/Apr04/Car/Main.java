package Apr04.Car;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name: ");
        String f=sc.next();
        sc.close();

        CarCollection data=new CarCollection(f);
        //we will use this if stmt if we r running this file through cmd and provide some argument like this "java ClassName abc.txt"
        // if(args.length>0){}

        char input=' ';
        do{
            System.out.println("Enter V for view, A to add, D to Delete, Q to Quit");
            switch(input){
                case 'V': data.view(); break;
                case 'A': 
                    System.out.println("Enter company name: ");
            }
        }while(input!='Q');
    }
}
