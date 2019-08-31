
package Lecture8;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MainWindow implements ActionListener {
    JFrame f;
    JLabel lbl_1,lbl_2,lbl_3;
    JTextField txt_1,txt_2,txt_3;
    JButton btn_add,btn_close,btn_dif,btn_pro,btn_div,btn_pow;
    
    public MainWindow(){
        f=new JFrame();
        lbl_1=new JLabel();
        lbl_2=new JLabel();
        lbl_3=new JLabel();
        txt_1=new JTextField();
        txt_2=new JTextField();
        txt_3=new JTextField();
        btn_add=new JButton();
        btn_close=new JButton();
        btn_dif=new JButton();
        btn_div=new JButton();
        btn_pro=new JButton();
        btn_pow=new JButton();
        
        
        f.setTitle("MyCalculator");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());
        f.setResizable(false);
        
        
        
        lbl_1.setText("Enter First Number ");
        txt_1.setColumns(15);
        lbl_2.setText("Enter Second Number");
        txt_2.setColumns(15);
        lbl_3.setText("Result is");
        txt_3.setColumns(15);
        
        
        
        
        
        btn_close.setText("CLOSE");
        btn_close.addActionListener(this);
        
        
        btn_add.setText("ADD");
        btn_add.addActionListener(this);
        
        btn_dif.setText("SUB");
        btn_dif.addActionListener(this);
        
        btn_pro.setText("MUL");
        btn_pro.addActionListener(this);
        
        btn_div.setText("div");
        btn_div.addActionListener(this);
        
        btn_pow.setText("pow");
        btn_pow.addActionListener(this);
        
        
        f.add(lbl_1);
        f.add(lbl_2);
        f.add(lbl_3);
        f.add(txt_1);
        f.add(txt_2);
        f.add(txt_3);
        f.add(btn_close);
        f.add(btn_add);
        f.add(btn_dif);
        f.add(btn_pro);
        f.add(btn_div);
        f.add(btn_pow);
        f.setVisible(true);
          
    }@Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn_close){
            System.exit(0);
        }
        else if(ae.getSource()==btn_add){
                 int n1,n2,n3;
                 n1=Integer.parseInt(txt_1.getText());
                 n2=Integer.parseInt(txt_2.getText());
                 Calculation c1=new Calculation(n1, n2);
              n3=c1.doADD();
                 txt_3.setText(Integer.toString(n3));
                 
                
            }
            else if (ae.getSource()==btn_dif){
                int num1,num2,num3;
                
                num1=Integer.parseInt(txt_1.getText());
                num2=Integer.parseInt(txt_2.getText());
                Calculation c2=new  Calculation(num1, num2);
                num3=c2.doDif();
                txt_3.setText(Integer.toString(num3));
            }
            else if(ae.getSource()==btn_pro){
                int num1,num2,num3;
               
                num1=Integer.parseInt(txt_1.getText());
                num2=Integer.parseInt(txt_2.getText());
                 Calculation c3=new Calculation(num1,num2);
                num3=c3.doPro();
                txt_3.setText(Integer.toString(num3));
            }
            else if (ae.getSource()==btn_div){
                int num1,num2,num3;
                
                num1=Integer.parseInt(txt_1.getText());
                num2=Integer.parseInt(txt_2.getText());
                Calculation c4=new Calculation(num1,num2);
                num3=c4.doADiv();
                txt_3.setText(Integer.toString(num3));
            }/*
            else if (ae.getSource()==btn_pow){
                int num1,num2, num3;
               
               num1=Integer.parseInt(txt_1.getText());
               num2=Integer.parseInt(txt_2.getText());
               Calculation c5=new Calculation(num1,num2);
               num3=c5.doPow();
               txt_3.setText(Integer.toString(num3));
               
            }*/
        } 
            
            
        
    }
    
    

