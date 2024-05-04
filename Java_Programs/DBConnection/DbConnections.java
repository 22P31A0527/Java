package DBConnection;

import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class DbConnections {
    public static void main(String[] args) throws SQLException {
        //1.Connecting to the data base
        //URL,Username,password
        try{
            String url="jdbc:mysql://localhost:3306/company";
            String user="root";
            String pass="Anjali@143";
            Connection con = DriverManager.getConnection(url, user, pass);
            if(con!=null) System.out.println("Successfully connected");
            //create a statement object
            Statement st = con.createStatement();
            //st.executeUpdate("insert into employee values(4,'ammu',100000)");
           /*  Scanner sc =new Scanner(System.in);
            System.out.println("How many insertions: ");
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                String id=JOptionPane.showInputDialog("Enter id of employee1");
                String name=JOptionPane.showInputDialog("enter name of employee 1");
                String salary=JOptionPane.showInputDialog("enter salary of employee1");  
                String query="insert into employee values("+id+",'"+name+"',"+salary+")";
                st.executeUpdate(query);
            }*/
            ResultSet rs=st.executeQuery("select * from employee");
            while(rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            }
            rs=st.executeQuery("show tables");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
        } 
        catch(SQLException e){
            System.out.println(e);
        }
        
      
    }
}
