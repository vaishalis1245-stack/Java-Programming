interface A
{   
   int no=11; 
   void fun();
   default void gun() //its add  in java 8 version word default 
   {
     
    System.out.println("Inside gun");   
   } 
   
}



class Demo implements A 
{
   public void fun()
   {
      System.out.println("Inside fun"); 
   }
}


class InterfaceDemo8
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        dobj.fun();
        dobj.gun();             
    }
}