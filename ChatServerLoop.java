import java.net.*;
import java.io.*;

class ChatServerLoop
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Server is waiting at port 5100");

        Socket sobj = ssobj.accept();
        System.out.println("Client Request get accepted succesfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("____________________________________________________");
        System.out.println("__________________________Marvellous Server__________________");
        System.out.println("____________________________________________________");

        String str1 = null, str2 = null;

        while((str1 = bobj1.readLine()) != null)
        {
            System.out.println("Client says : "+str1);
            System.out.println("Enter message for client :");
            str2  = bobj2.readLine();
            pobj.println(str2);
        }

        
}
}