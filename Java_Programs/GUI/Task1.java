package GUI;
//package GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class Task1 {
    public static void main(String[] args) {
        JFrame w1=new JFrame("Task1");
        w1.setVisible(true);
        w1.setSize(1000,1000);
        JLabel l1=new JLabel();
        JLabel l2=new JLabel();
        JLabel l3=new JLabel();
        l1.setText("Celesius");
        l3.setText("=");
        l2.setText("Fahrenheit");
        l1.setFont(new Font("MV Boli",Font.BOLD,30));
        l3.setFont(new Font("MV Boli",Font.BOLD,30));
        l2.setFont(new Font("MV Boli",Font.BOLD,30));
        w1.setLayout(null);
        l1.setBounds(0,50,200,200);
        l3.setBounds(450,200,400,100);
        l2.setBounds(500,50,200,200);
        w1.add(l1);
        w1.add(l2);
        w1.add(l3);
        JTextField t1= new JTextField();
        JTextField t2=new JTextField();
        t1.setFont(new Font("MV Boli",Font.BOLD,20));
        t2.setFont(new Font("MV Boli",Font.BOLD,20));
        t1.setBounds(0,200,400,100);
        t2.setBounds(500,200,400,100);
        JButton b1=new JButton();
        JButton b2=new JButton();
        b1.setText("Convert");
        b2.setText("Clear");
        b1.setBounds(0,400,200,100);
        b2.setBounds(500,400,200,100);
        b1.setFont(new Font("MV Boli",Font.BOLD,30));
        b2.setFont(new Font("MV Boli",Font.BOLD,30));
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(t1.getText().equals("")&&t2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please fill any TextField", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
                else if(t2.getText().equals("")){
                int c=Integer.parseInt(t1.getText());
                c=(c*(9/5))+32;
                t2.setText(String.valueOf(c));
                }
                else if(t1.getText().equals("")){
                int c=Integer.parseInt(t2.getText());
                c=(c-32)*(5/9);
                t1.setText(String.valueOf(c));
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please fill only 1 TextField", "ERROR", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText("");
                t2.setText("");
            }
        });
        w1.add(b1);
        w1.add(b2);
        w1.add(t1);
        w1.add(t2);
        w1.setBackground(Color.BLACK);
    }
}