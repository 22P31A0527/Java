package GUI;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class GUIMessageExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JOptionPane jop = new JOptionPane();
        jop.showMessageDialog(frame , "Hello!");
    }
}
