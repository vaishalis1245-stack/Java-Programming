import java.util.Scanner;

class SelectionDemo1

{
    public static  void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int ino = 0;

       System.out.println("Enter your age :");
       ino = sobj.nextInt();

       if(ino >= 18)
       {
        System.out.println("You can vote");

       }
       else
       {
        System.out.println("you cant vote");
       }
    }       
}