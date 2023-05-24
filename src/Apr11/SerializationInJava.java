package Apr11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Student implements Serializable{
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationInJava{
    public static void main(String[] args) {
        // Serialization - Converting the state of an objct into a byte-stream - writeObject() from ObjectOutputStream
        // Deserialization - Reading a byte-stream into a state of an object - readObject() from ObjectInputStream

        // Serialization
        // try{
        //     Student s1=new Student(10994, "Radheshyam");
        //     FileOutputStream fos=new FileOutputStream("./src/Apr11/test.txt");
        //     ObjectOutputStream oos=new ObjectOutputStream(fos);
        //     oos.writeObject(s1);
        //     oos.flush();
        //     oos.close();
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        // Deserialization
        // try{
        //     ObjectInputStream ois=new ObjectInputStream(new FileInputStream("./src/Apr11/test.txt"));
        //     Student s1=(Student)ois.readObject();
        //     ois.close();
        //     System.out.println("ID: "+s1.id+"\nName: "+s1.name);
        // }catch(Exception e){
        //     System.out.println(e);
        // }

        Scanner sc=new Scanner(System.in);
        String name;
        int id;
        try{
            // FileOutputStream fos=new FileOutputStream("./src/Apr11/test.txt");
            // ObjectOutputStream oos=new ObjectOutputStream(fos);
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("./src/Apr11/test.txt"));
            for(int i=0;i<3;i++){
                System.out.print("Enter your name: ");
                name=sc.nextLine();
                System.out.print("Enter your id: ");
                id=Integer.parseInt(sc.nextLine());
                System.out.println();
                Student s1=new Student(id, name);
                oos.writeObject(s1);
            }
            oos.flush();
            oos.close();
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            // FileInputStream fis=new FileInputStream("./src/Apr11/test.txt");
            // ObjectInputStream ois=new ObjectInputStream(fis);
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("./src/Apr11/test.txt"));
            for(int i=0;i<3;i++){
                Student s1=(Student)ois.readObject();
                System.out.println("ID: "+s1.id+" Name: "+s1.name);
            }
            ois.close();
        }catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}