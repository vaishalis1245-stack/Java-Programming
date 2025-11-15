import javax.swing.*;


class PPAFrameclose
{
    public static void main(String a[])
    {
         JFrame fobj = new JFrame("PPA");
         fobj.setSize(300,300);
         fobj.setVisible(true); //render the frame
        
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    } 
}