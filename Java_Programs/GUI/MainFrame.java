package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
public class MainFrame extends JFrame implements ActionListener {
    //constructor
    JButton button1,button2;
    MainFrame(){
        setTitle("MainFrame");
        setSize(500,500);
        setLayout(null);
        button1=new JButton("Frame 1");
        button1.setBounds(100,100,100,45);
        button2=new JButton("Frame 2");
        button2.setBounds(100,160,100,45);
        button2.addActionListener(this);
        button1.addActionListener(this);
        add(button1);
        add(button2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1) new Frame1();
        if(e.getSource()==button2) System.out.println("Clicked button2");
    }
}
//main frame
