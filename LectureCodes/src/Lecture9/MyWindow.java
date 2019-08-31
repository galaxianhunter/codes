
package Lecture9;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class MyWindow extends JFrame{
    public MyWindow(){
        JLabel lbk_1;
        
        setTitle("My first window");
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        
    }
    
}
