class Base
{
    final public void fun() //defination
   {}
  public public void gun() //defination
   {}

}

class Derived extends Base
{
   public void run() //defination
   {}
   public void gun() 
   {
    System.out.println("Inside gun"); //this method cannot overriden 
   }
}

class FinalMethod2
{
    public static void main(String A[])
    {
       Derived dobj = new Derived();

       dobj.gun();
       
    }
}