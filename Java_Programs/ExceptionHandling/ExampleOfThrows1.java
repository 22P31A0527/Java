package ExceptionHandling;
import java.sql.*;
import javax.swing.JOptionPane;
public class ExampleOfThrows1 {
    static Connection con;
    static void connect(String url , String user , String password , String database) throws SQLException {
        con = DriverManager.getConnection(url+database , user , password);
    }
    public static void main(String[] args) {
        try {
            connect("jdbc:mysql://localhost:3306/" , "root" , "Anjali@143" , "company");
            if(con != null) System.out.println("successful");
        }
        catch(SQLException e) {
            // System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage(), "Oops..!!😥", JOptionPane.ERROR_MESSAGE);
        }
    }
}
