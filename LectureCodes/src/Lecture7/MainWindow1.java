
package Lecture7;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class  MainWindow1 implements ActionListener{
    JFrame f;
    JLabel lbl_num1,lbl_num2;
    JTextField txt_num1,txt_num2;
    JButton btn_close,btn_add;
    
    
    public MainWindow1(){
        f=new JFrame("Calculator"); //f.setTitle("Calculator")
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        
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
        }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn_close){
            System.out.println("Closing....");
            System.exit(0);
        }
        else if (ae.getSource()==btn_add){
            System.out.println("Adding.....");
            int num1,num2,num3;
            num1=Integer.parseInt(txt_num1.getText());
            num2=Integer.parseInt(txt_num2.getText());
            num3=num1+num2;
            System.out.println("Result is:"+num3);
            }
    }
    public static void main(String[] args) {
        new MainWindow1();
    }
    
    
    
}
