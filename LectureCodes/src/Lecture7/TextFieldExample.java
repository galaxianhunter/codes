
package Lecture7;

import javax.swing.*;
import java.awt.event.*;
import static java.lang.Math.abs;
public class TextFieldExample implements ActionListener{
    JFrame f;
    JLabel lbl_num1,lbl_num2;
    JTextField txt_num1,txt_num2,txt_sum;
    JButton btn_add,btn_sub,btn_close;
    public TextFieldExample(){
        f=new JFrame();
        f.setTitle("Calculator");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        lbl_num1=new JLabel();
        lbl_num1.setText("Enter first number");
        f.add(lbl_num1);
        
        
        lbl_num2=new JLabel();
        lbl_num2.setText("Enter second number");
        f.add(lbl_num2);
        
        
        
        
        txt_num1=new JTextField();
        txt_num1.setColumns(10);
        f.add(txt_num1);
        
        
        txt_num2=new JTextField();
        txt_num2.setColumns(10);
        f.add(txt_num2);
        
        btn_close=new JButton();
        btn_close.setText("Close");
        btn_close.addActionListener(this);
        f.add(btn_close);
        
        
        
        
        btn_add=new JButton();
        btn_add.setText("ADD");
        btn_add.addActionListener(this);
        f.add(btn_add);
        
        
        btn_sub=new JButton();
        btn_sub.setText("Subtract");
        btn_sub.addActionListener(this);
        f.add(btn_sub);
        
        
    }
    @Override
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==btn_close){
           System.out.println("Closing...");
           System.exit(0);
       }else if (ae.getSource()==btn_add){
           System.out.println("Adding...");
           int num1,num2,num3;
           num1=Integer.parseInt(txt_num1.getText());
           num2=Integer.parseInt(txt_num2.getText());
           num3=num1+num2;
           System.out.println("The Sum is"+num3);
           
           
       }
       else if (ae.getSource()==btn_sub){
           System.out.println("Subracting....");
           int num1,num2,num3;
           num1=Integer.parseInt(txt_num1.getText());
           num2=Integer.parseInt(txt_num2.getText());
           num3=abs(num1-num2);
           System.out.println("the Difference is :"+num3);
           
       }
   }
    public static void main(String[] args) {
        new TextFieldExample();
    }
    
    
}
