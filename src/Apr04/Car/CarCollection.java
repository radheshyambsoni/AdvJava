package Apr04.Car;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class CarCollection implements CarInt{
    private CarInt[] cList;
    private File f;
    
    public CarCollection(File f) throws FileNotFoundException{
        this.f = f;
        read();
    }
    public CarCollection(String name) throws FileNotFoundException{
        this(new File(name));
    }

    public void read() throws FileNotFoundException{
        if(f.exists()){
            Scanner sc=new Scanner(f);
            int size=Integer.parseInt(sc.nextLine());
            cList=new CarInt[size];
            for(int i=0;i<size;i++){
                String name=sc.nextLine();
                double price=Double.parseDouble(sc.nextLine());
                cList[i]=new Sedan(name, price);
            }
            sc.close();
        }else{
            System.out.println("File not found!");
        }
    }

    public void write() throws FileNotFoundException{
        PrintStream ps=new PrintStream(f);
        ps.println(cList.length);
        for(int i=0;i<cList.length;i++){
            //if not done casting, giving error for both next 2 lines
            ps.println(((Sedan) cList[i]).getCompanyName());
            ps.println(((Sedan) cList[i]).getPrice());
        }
        ps.close();
    }
    public void add(String name,double price){
        CarInt[] newList=Arrays.copyOf(cList, cList.length+1);
        newList[cList.length]=new Sedan(name, price);
        cList=newList;
    }

    public void delete(int idx){
        CarInt[] newList=Arrays.copyOf(cList, cList.length-1);
        for(int i=idx+1;i<cList.length;i++){
            newList[i-1]=cList[i];
        }
        cList=newList;        
    }

    public void view(){
        for(int i=0;i<cList.length;i++){
            System.out.printf("%3d:%s:$.2f\n",(i+1),((Sedan) cList[i]).getCompanyName(),((Sedan) cList[i]).getPrice());
        }
    }
    
    @Override
    public void accelerate() {
        System.out.println("this is implemented accelerate method");
    }
    @Override
    public void media() {
        System.out.println("this is implemented media method");
    }
}