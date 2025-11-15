import javax.swing.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;


class Client implements ActionListener 
{
    //Characteristics
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JLabel Numlabel,Reslabel;

    public Client(String title,int width,int height)
    {
        fobj = new JFrame(title);

        Numlabel = new JLabel("Message");
        Numlabel.setBounds(50,50,150,30);

        tobj = new JTextField(10);
        tobj.setBounds(150,50,150,30);

        bobj = new JButton("Send");
        bobj.setBounds(150,100,150,30);
         
        Reslabel = new JLabel();
        Reslabel.setBounds(150,210,250,30);

        fobj.add(Numlabel);
        fobj.add(tobj);
        fobj.add(bobj);
        fobj.add(Reslabel);

        bobj.addActionListener(this);
        fobj.setLayout(null);

        fobj.setSize(width,height); 
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
            public void actionPerformed(ActionEvent aobj)
            {
                String str = tobj.getText(); 
                try
                {
                 Socket sobj = new Socket("localhost",5100);
        System.out.println("Client get connected with server succesfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        String tobj = null, bobj = null;
        System.out.println("Enter message for server :");
         while(!(tobj  = bobj2.readLine()).equals("end"))
         {
            pobj.println(tobj);
            bobj = bobj1.readLine();
            System.out.println("Server says : "+bobj);
            System.out.println("Enter message for server :");
         }
                }catch(Exception e)
                {}

            }
}



class ClientGUI
{
    public static void main(String A[])
    {
        Client cobj = new Client("Client",500,300);
    }
}