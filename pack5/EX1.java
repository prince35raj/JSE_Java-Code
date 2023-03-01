package pack5;


import java.sql.*;
// import java.sql.DriverManager;


public class EX1 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "prince");

            System.out.println("Connection Established successfully");
        } catch (Exception e) {
            System.out.println(e);
        }

    }


}



