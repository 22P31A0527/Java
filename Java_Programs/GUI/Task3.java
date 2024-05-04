package GUI;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.*;
public class Task3 {
	public static void main(String[] args) {
		// 1. Connecting to the data base
		// URL, username, password
		try {
			String url = "jdbc:mysql://localhost:3306/bookshop";
			String user = "root"; 
			String pass = "Anjali@143"; 
			Connection con = DriverManager.getConnection(url, user, pass);
			if (con != null) System.out.println("Successfully Connected");
            JButton b1=new JButton("select an author");
            b1.setBounds(0,20, 150, 60);
            JComboBox c1=new JComboBox();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select distinct author from books");
            while (rs.next()) {
                c1.addItem(rs.getString(1));   
            }
            JTextArea area=new JTextArea();
            area.setBounds(0,200,800,400);
            area.setFont(new Font("Cascadia Code",Font.BOLD,20));
            JScrollPane pane=new JScrollPane();
            pane.setBounds(0,800,800,400);

             c1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent p)
                {
                    String str1=(String)c1.getSelectedItem();

                    System.out.println(str1);
                   System.out.println(str1.getClass());
                    String query = "select id,title,price,genre from books where author='"+str1+"';";
                    try{
                        //System.out.println(query);
                        ResultSet rs1=st.executeQuery(query);
                        area.setLineWrap(true);
                        area.setWrapStyleWord(true);
                       // System.out.println(rs1);
                        while(rs1.next()){
                            // String s=(rs1.getString(1));
                            if(area.getText()!=null)
                            {
                                area.setText("");
                            }
                            area.append("Id\ttitle\t\tprice\tgenre");
                            area.append("\n");
                            area.append(rs1.getString(1)+"\t"+rs1.getString(2)+"\t\t"+rs1.getString(3)+"\t"+rs1.getString(4));
                        }

                    } catch(Exception e){
                        System.out.println("error "+e);
                    }
                     
                }
            });
            JFrame j1=new JFrame("ComboBox Example");
            c1.setFont(new Font("MV Boli",Font.BOLD,20));
            c1.setBounds(0, 100, 150, 50);
             //c1.setSelectedItem(null);
             j1.setSize(900,900);
            j1.setResizable(false);
            j1.setLayout(null);
            j1.add(c1);
            j1.setVisible(true);
            j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             j1.add(b1);
             j1.add(area);
             j1.add(pane);
	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
