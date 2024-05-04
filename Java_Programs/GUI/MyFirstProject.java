package GUI;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
/*import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener; // Interface
import java.awt.event.ActionEvent; // Class
import javax.swing.JTextField;*/
public class MyFirstProject {
    public static void main(String args[]) {
       JFrame window = new JFrame();
       window.setTitle("Degree converter");
       window.setBackground(null);
       window.setSize(600, 600);
       window.setLayout(null);
       window.setResizable(true);
       JLabel l = new JLabel();
       l.setText("Convertion");
       l.setBounds(250, 10, 200, 20);
       l.setForeground(Color.red);
       window.add(l);
       window.setVisible(true); // Makes window visible
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
