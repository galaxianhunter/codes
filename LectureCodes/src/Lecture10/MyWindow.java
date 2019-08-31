

package Lecture10;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
public class MyWindow extends JFrame{
    JRadioButton rb_male,rb_female;
    JCheckBox chk_reading, chk_playing;
    
    
    public MyWindow(){
        this.setTitle("First Window");
        this.setSize(400,400);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        
        rb_male=new JRadioButton("Male");
        rb_female= new JRadioButton("Female");
        //rb_female.setSelected(true)
        ButtonGroup bg=new ButtonGroup();
        
        bg.add(rb_male);
        bg.add(rb_female);
        
        
        chk_reading=new JCheckBox("Reading");
        chk_playing= new JCheckBox("playing");
        
        
        this.add(rb_male);
        this.add(rb_female);
        this.add(chk_reading);
        this.add(chk_playing);
        this.setVisible(true);
        
        
    }
    
}
