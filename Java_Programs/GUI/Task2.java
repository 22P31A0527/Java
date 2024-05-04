package GUI;
import java.sql.*;
import java.sql.Connection;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
public class Task2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Task 2");
        jf.setLayout(null);
        jf.setSize(1000 , 1000);
        
        try {
            String url = "jbdb:mysql://localhost:3306/Bookshop";
            String user = "root";
            String password = "Anjali@143";
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select distinct author from Books;");
            JComboBox<String> jcb = new JComboBox<>();
            jcb.setBounds(100, 100, 100, 100);
            while(rs.next()) {
                jcb.addItem(rs.getString(1));
            }
            jcb.setFont(new Font("MV Boli",Font.BOLD,20));
            jf.add(jcb);
            
        }
        catch(SQLException e) {
            System.out.println(e);
        }
        jf.setVisible(true);
        jf.getContentPane().setBackground(Color.pink);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
