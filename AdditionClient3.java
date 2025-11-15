import java.util.*;//Scanner Package
import java.net.*;//for Socket Programming
import java.io.*;//fot Input and Output Stream Classes

class AdditionClient3
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is Running...");


        Socket sobj = new Socket("localhost",2100);
         System.out.println("Server Successfully conected");

         DataInputStream diobj = new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());

        int no1 = 11, no2 = 10;
        
        doobj.writeInt(no1);
        doobj.writeInt(no2);




        int sum = diobj.readInt();
        System.out.println("Addition is :"+sum);

        sobj.close();

        System.out.println("Client application Terminated...");

    }
}