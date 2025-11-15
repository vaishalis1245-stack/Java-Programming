interface A
{   
   int no=11; 
   void fun();
   
}

interface B
{  
   int no=21;
   void fun();
}

class Demo implements A,B //Multiple Inheritance
{
   public void fun()
   {
      System.out.println("Inside fun"+A.no); //no generates error bcz anbiguty
   }
}


class InterfaceDemo7
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        dobj.fun();
              
    }
}