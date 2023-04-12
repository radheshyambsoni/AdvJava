package Apr12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class Employee{
    int id,age;
    String name;

    public void dipslay(){
        System.out.println(id+" "+name+" "+age);
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your id: ");
        id=Integer.parseInt(sc.nextLine());
        System.out.print("Enter your age: ");
        age=Integer.parseInt(sc.nextLine());
        System.out.print("Enter your name: ");
        name=sc.nextLine();
        sc.close();
    }
}

public class Main {
    public static void main(String[] args){
        // Operations:
        // create a table
        // insert data
        // view data
        // update data
        try{
            // // 1. Load the driver
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            // 2. Create the connection object
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "r11b12@ROOT");
            // 3. Create Statement
            Statement stmt=con.createStatement();

            // create a table
            // the stmt is subjective to the db used - for ex the below stmt is for oracle db
            // for mysql - number -> integer, varchar2 -> varchar
            String sql="create table emp(id number(10), name varchar2(40), age number(3))";
            stmt.executeUpdate(sql);
            con.commit();

            Employee e=new Employee();
            for(int i=0;i<3;i++){
                e.input();
                String SQL="insert into emp values(?,?,?)";
                PreparedStatement pstmt=con.prepareStatement(SQL);
                pstmt.setInt(1, e.id);
                pstmt.setString(2, e.name);
                pstmt.setInt(3, e.age);
                pstmt.executeUpdate();
                pstmt.close();
            }

            // 4. Execute Statement
            ResultSet rs=stmt.executeQuery("select * from emp");
            // Displaying values
            while(rs.next()){
                e.id=rs.getInt(1);
                e.name=rs.getString(2);
                e.age=rs.getInt(3);
                e.dipslay();
            }
            rs.close();
            
            // Updating values
            stmt.executeUpdate("update emp set id="+3+"where name="+"Raman");
            con.commit();

            rs=stmt.executeQuery("select * from emp");
            // Displaying values again
            while(rs.next()){
                e.id=rs.getInt(1);
                e.name=rs.getString(2);
                e.age=rs.getInt(3);
                e.dipslay();
            }

            
            // 5. Close connection
            rs.close();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }

        // Additional stuff to learn
        // Data type conversion from Java to RDBMS and vice versa
    }
}
