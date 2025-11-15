import java.util.*;

class ExceptionDemo6
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int ino1=0, ino2=0, ians=0;
       
       
       System.out.println("Enter first no:");
       ino1 = sobj.nextInt();

       System.out.println("Enter second no:");
       ino2 = sobj.nextInt();
       
      try
      { 
        System.out.println("Inside try block");
        ians = ino1 / ino2;
      }
      
      catch(Exception eobj) //generic catch //erroe due to catch sequance
      {
        System.out.println("Inside generic catch");
      }
      catch(ArithmeticException aobj) //specific catch
      {
        System.out.println("Inside catch block");
        System.out.println(aobj);
      }

      System.out.println("Division is :"+ians);


    }
}