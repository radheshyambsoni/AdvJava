package Apr11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        // Operations:
        // create a table // create table person (ID int, Name varchar(255))
        // insert data // insert into person values(?,?)
        // view data // select * from persons
        // update data // update person set name=? where id=?
        // delete data // delete from person where id?


        try {
            // Step 1
            // Class.forName("com.mysql.jdbc.Driver");
            
            // Step 2 create  the connection object
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "r11b12@ROOT");

            // Step 3 create the statement object
            Statement stmt=con.createStatement();

            String sql="insert into person values(?,  ?)";
            PreparedStatement pstmt=con.prepareStatement(sql);
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1, 10841);
            pstmt.setString(2, "Shaurya Verma");
            pstmt.executeUpdate();
            
            
            String print="select * from person";
            ResultSet rs=stmt.executeQuery(print);
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            System.out.println("\nUpdated: ");
            
            sql="UPDATE person SET Name=? WHERE ID=?";
            pstmt=con.prepareStatement(sql);
            pstmt.setString(1, "Abhinay Garg");
            pstmt.setInt(2, 10841);
            pstmt.executeUpdate();

            sql="DELETE from person WHERE ID=?";
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1, 10841);
            pstmt.executeUpdate();

            sql="insert into person values(?,?)";
            pstmt=con.prepareStatement(sql);
            pstmt.setInt(1 , 10994);
            pstmt.setString(2 , "Radhe");
            pstmt.executeUpdate();
            
            rs=stmt.executeQuery(print);
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}