import javax.swing.*;
import java.awt.event.*;

class Calculater1 implements ActionListener
{
    //characteristics
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JLabel Num1label, Num2label, Resultlabel;

    public Calculater1(String tile, int width, int height)
    {
        fobj = new JFrame(title);

        Num1label = new JLabel("Number1");
        Num1label.setBounds(50,50,100,30);

        tobj = new JTextField();
        tobj.setBounds(150,50,150,30)

        Num2label2= new JKabel("Number 1");
        Num2label.setBounds(50,100,100,30);

        tobj = new JTextField

        fobj.addActionListener(this);
        fobj.setLayout(null);
        fobj.setSize(width,height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
       public void actionPerformed(ActionEvent aobj)
    {
    
    }
}
class Calculater
{
    public static void main(String A[])
    {
        Calculater1 cobj = new Calculator1("calculater",400,300); 
    }
}