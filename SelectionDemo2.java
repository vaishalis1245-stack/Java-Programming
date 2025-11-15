
import java.util.Scanner;

class SelectionDemo2

{
    public static  void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int istd = 0;
       System.out.println("Enter your Standerd :");
       istd = sobj.nextInt();

       if(istd == 1)
       {
        System.out.println("Exam at 9 AM");
       }
       else if(istd==2)
       {
        System.out.println("Exam at 10 AM");
       }
       else if(istd==3)
       {
        System.out.println("Exam at 11 AM");
       }
       else if(istd==4)
       {
        System.out.println("Exam at 12 AM");
       }
       else
       {
         System.out.println("Invalid Std");
       }

}       
}