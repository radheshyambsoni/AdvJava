package Apr12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class Employee {
    int id, age;
    String name;

    public void dipslay() {
        System.out.println(id + " " + name + " " + age);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your id: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your age: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        sc.close();
    }
}

public class Main {
    public static void main(String[] args) {
        // Operations:
        // create a table
        // insert data
        // view data
        // update data

        try {
            // step2 create  the connection object
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "r11b12@ROOT");

            //step3 create the statement object  
            Statement stmt=con.createStatement();

            // String sql="INSERT INTO Persons (ID, Name) VALUES (?, ?)";
            String sql="UPDATE Persons SET Name=? WHERE ID=?";
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt.setString(1, "Garg Abhinay");
            pstmt.setInt(2, 10993);
            pstmt.executeUpdate();
            
            sql="select * from Persons";
            ResultSet rs=stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            // System.out.println(hm);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
