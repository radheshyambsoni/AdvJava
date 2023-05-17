package Apr11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        // Operations:
        // create a table
        // insert data
        // view data
        // update data

        try {
            // Step 1
            Class.forName("com.mysql.jdbc.Driver");
            
            // Step 2 create  the connection object
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "r11b12@ROOT");

            // Step 3 create the statement object  
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

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}