import javax.swing.*;
import java.awt.event.*;

class MarvellousListener implements ActionListnener
{
    public void actionperformed(ActionEvent aobj)
                {
                    System.out.println("Button Click....");
                }

}

class EventHandlingSeparateClass
{
    public static void main(String a[])
    {
         JFrame fobj = new JFrame("PPA");

         JButton bobj = new JButton("OK");

         bobj.setBounds(100,100,150,50);
         bobj.addActionListener(New MarvllousListnner);


         fobj.add(bobj);


         fobj.setSize(400,300);
         fobj.setLayout(null);
         fobj.setVisible(true); //render the frame
        
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    } 
}