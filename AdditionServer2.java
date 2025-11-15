import java.util.*;
import java.net.*;
import java.io.*;

class AdditionSever2 //Second step
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Server is Running...");
        ServerSocket ssobj = new ServerSocket(2100);
        System.out.println("Server is waiting at port no 2100");
        Socket sobj = ssobj.accept();
        System.out.println("Client Request arrives and accepted by the server");

        DataInputStream diobj = new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());
    }
}