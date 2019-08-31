
package Lecture14;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyWindow extends JFrame implements ActionListener{
    JMenuBar menubar_1;
    JMenu menu_1,menu_2,menu_3,menu_4;
    JMenuItem exit;
    
    MyWindow(){
        this. setTitle("Menubar test");
        this. setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        
        menubar_1=new JMenuBar();
        menu_1=new JMenu("File");
        menu_2=new JMenu("Edit");
        menu_3=new JMenu("View");
        menu_4=new JMenu("Help");
        exit=new JMenuItem("Exit");
        exit.addActionListener(this);
        
        menu_1.add(exit);
        menubar_1.add(menu_1);
        menubar_1.add(menu_2);
        menubar_1.add(menu_3);
        menubar_1.add(menu_4);
        
        this.add(menubar_1);
        this.setVisible(true);
        
        
    }@Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(exit)){
            System.exit(0);
        }
    }
    
    
}
