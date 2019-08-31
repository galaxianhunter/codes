
package Lecture13;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
public class MyWindow extends JFrame implements ActionListener{
    
    JComboBox cmb_age;
    JList lst_acq;
    JButton btn_ok;
    MyWindow(){
        //label
        //Testfield
        //Button
        
        
        this.setTitle("My Window");
        this.setSize(new Dimension(500,500));
        this.setLayout(new FlowLayout());
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
         String str_age[]=new String [4];
       
        str_age[0]="1-15";
        str_age[1]="16-29";
        str_age[2]="30-44";
        str_age[3]="45+";
        
        cmb_age=new JComboBox(str_age);
        cmb_age.setSelectedIndex(1);
        
        
        //lst_acq=new JList();
        
        String ac_qf[]={"SEE","+2","Others"};
       lst_acq=new JList(ac_qf);
       
       
       btn_ok=new JButton("OK");
       btn_ok.addActionListener(this);
       
       
        this.add(lst_acq);
        this.add(cmb_age);
       this.add(btn_ok);
        
        
        
        
        this.setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==btn_ok){
            String tmp1,tmp2;
            tmp1=(String)cmb_age.getSelectedItem();
            tmp2=lst_acq.getSelectedValue().toString();
            System.out.println(tmp1+","+tmp2);
        }
        
    }
    
}
