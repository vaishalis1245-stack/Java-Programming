
import java.util.Scanner;

class SwitchDemo

{
    public static  void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int istd = 0;
       System.out.println("Enter your Standerd :");
       istd = sobj.nextInt();

       switch(istd)
       {
        case 1:
           System.out.println("Exam at 9 Am");
           break;

           case 2:
           System.out.println("Exam at 10 Am");
           break;

           case 3:
           System.out.println("Exam at 11 Am");
           break;

           case 4:
           System.out.println("Exam at 12 Noon");
           break;

           deafult:
           System.out.println("Invalid std");
           break;
       }



}       
}