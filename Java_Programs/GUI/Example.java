package GUI;
import javax.swing.JOptionPane;
public class Example {
    public static void main(String args[]) 
    {
        //int s = Integer.parseInt(JOptionPane.showInputDialog("Enter value"));
        //System.out.println(s);
        String s = (String)JOptionPane.showInputDialog(null,"Is this a qursitpn","Dialog ",2 , null ,null ,"Type something");
       System.out.println(s);
    }
}
