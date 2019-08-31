
package Lecture7;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class TextAreaExample {
    JFrame f;
    JTextField txt;
    JLabel lbl;
    JButton btn_close;
    
TextAreaExample(){
    f=new JFrame();
    f.setTitle("EXample");
    f.setSize(800,500);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(new FlowLayout());
    
    
     btn_close=new JButton("Close");
    btn_close.setBounds(100,250,200,20);
    f.add(btn_close);
    txt=new JTextField();
    txt.setColumns(15);
    f.add(txt);
    
    lbl =new JLabel();
    lbl.setText("welcome to GUI programming");
    lbl.setBounds(100,200,200,50);
    f.add(lbl);
    
    
    
    
    
    f.setVisible(true);
   
        
    }
    public static void main(String[] args) {
        new TextAreaExample();
    }
    
}
