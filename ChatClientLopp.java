import java.net.*;
import java.io.*;

class ChatClientLopp
{
    public static void main(String A[]) throws Exception
    {
        


        
        Socket sobj = new Socket("localhost",5100);
        System.out.println("Client get connected with server succesfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("____________________________________________________");
        System.out.println("__________________________Marvellous Client__________________");
        System.out.println("____________________________________________________");

         String str1 = null, str2 = null;
        System.out.println("Enter message for server :");
         while(!(str1  = bobj2.readLine()).equals("end"))
         {
            pobj.println(str1);
            str2 = bobj1.readLine();
            System.out.println("Server says : "+str2);
            System.out.println("Enter message for server :");
         }
        }
}