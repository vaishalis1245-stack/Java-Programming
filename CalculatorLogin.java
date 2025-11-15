import javax.swing.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
    //characteristics
    JFrame fobj;
    JButton bobj1, bobj2, bobj3, bobj4;
    JTextField tobj1,tobj2;
    JLabel Num1label, Num2label, Reslabel;

    public Calculator(String title,int width,int height)
    {
        fobj = new JFrame(title);

        Num1label = new JLabel("Number 1");
        Num1label.setBounds(50,50,150,30);

        tobj1 = new JTextField(10);
        tobj1.setBounds(150,50,150,30);

        Num2label= new JLabel("Number 2");
        Num2label.setBounds(50,100,100,30);

        tobj2 = new JTextField(10);
        tobj2.setBounds(150,100,150,30);

        bobj1 = new JButton("+");
        bobj1.setBounds(60,170,50,20);

        bobj2 = new JButton("-");
        bobj2.setBounds(120,170,50,20);

        bobj3 = new JButton("*");
        bobj3.setBounds(180,170,50,20);

        bobj4 = new JButton("/");
        bobj4.setBounds(240,170,50,20);

        Reslabel = new JLabel();
        Reslabel.setBounds(150,210,250,30);

        fobj.add(Num1label);
        fobj.add(tobj1);
        fobj.add(Num2label);
        fobj.add(tobj2);
        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(Reslabel);
        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);

        
        fobj.setLayout(null);

        fobj.setSize(width,height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent aobj)
    {
        
       double num1  = Double.parseDouble(tobj1.getText());
    double num2  = Double.parseDouble(tobj2.getText());
       double result = 0;
       try
       {
       if(aobj.getSource()== bobj1) 
       {
          result = num1 + num2;
       }
       else if(aobj.getSource()== bobj2) 
       {
          result = num1 - num2;
       }
       else if(aobj.getSource()== bobj3) 
       {
          result = num1 * num2;
       }
       else if(aobj.getSource()== bobj4) 
       {
          if (num2 == 0)
          {
            Reslabel.setText("Result cannot divide by zero..");
            return;
          }
          result = num1 / num2;
       }
       Reslabel.setText("Result :"+result);
    }catch(NumberFormatException ex)
    {
        Reslabel.setText("Result : Invalid input..");
    }
       
    }


    }
class CalculatorLogin
{
    public static void main(String A[])
    {
        Calculator cobj = new Calculator("Calculater",500,300);
    }
}