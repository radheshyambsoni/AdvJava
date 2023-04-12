package Apr11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCInJava {
    public static void main(String[] args) {
        // create table emp(id number(10),ame varchar(40), age number(3));
        // insert into ....(we have to fill the rest of code)
        try{
            // 1. Load the driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // 2. Create the connection object
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "root", "root");
            // 3. Create Statement
            Statement stmt=con.createStatement();
            // 4. Execute Statement
            ResultSet rs=stmt.executeQuery("select * from emp");
            rs.close();
            // 5. Close connection
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
