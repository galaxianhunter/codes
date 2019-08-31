
package Lecture7;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;//button click event notifiaction
import java.awt.event.ActionListener;
public  class Window implements ActionListener {
   
    JFrame f;
    JLabel lbl_num1;
    JLabel lbl_num2;
    JTextField txt_num1;
    JTextField txt_num2;
    JButton btn_close;
    JButton btn_ADD;
    public Window(){
        f=new JFrame("Calculator");
        f.setSize(300,170);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        lbl_num1=new JLabel();
        lbl_num1.setText("Enter first number");
        f.add(lbl_num1);
     
        
        lbl_num2=new JLabel();
        lbl_num2.setText("Enter second number");
        
        txt_num1=new JTextField();
        txt_num1.setColumns(10);
        txt_num2=new JTextField();
        txt_num2.setColumns(10);
        
        
        btn_close=new JButton();
        btn_close.setText("Close");
        btn_close.addActionListener(this);
        btn_ADD=new JButton();
        btn_ADD.setText("ADD");
        btn_ADD.addActionListener(this);
        
        f.add(lbl_num2);
        f.add(txt_num1);
        f.add(txt_num2);
        f.add(btn_close);
        f.add(btn_ADD);
        f.setVisible(true);
        
     
    }
    

 
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn_close){
            System.out.println("Closing");
            System.exit(0);
        }
        else if (ae.getSource()==btn_ADD){
            System.out.println("Ading.....");
            int num1,num2,num3;
            num1=Integer.parseInt(txt_num1.getText());
            num2=Integer.parseInt(txt_num2.getText());
            num3=num1+num2;
            System.out.println("Result:"+num3);
            
        }
    }
    public static void main(String[] args) {
        new Window();
    }
}

