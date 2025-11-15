import java.util.*;
import java.net.*;
import java.io.*;

class AdditionClient2
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Client is Running...");


        Socket sobj = new Socket("localhost",2100);
         System.out.println("Server Successfully conected");

         DataInputStream diobj = new DataInputStream(sobj.getInputStream());
        DataOutputStream doobj = new DataOutputStream(sobj.getOutputStream());
    }
}