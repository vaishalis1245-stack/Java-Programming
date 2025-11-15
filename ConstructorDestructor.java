class Demo
{
    public int ino1;
    public int ino2;

    public Demo()
    {
        System.out.println("Inside Deafult constructor");
    }
    public Demo(int i,int j)
    {
        System.out.println("Inside parameterised constructor");
    }
    protected void finalize()  
    {
         System.out.println("Inside finalize");
    }
}

class ConstructorDestructor
{

    public static void main(String Arg[])
    {
      Demo dobj1 = new Demo(); //demo dobj;

      Demo dobj2 = new Demo(11,21);  //demo dobj2;

      dobj1 = null;
      dobj2 = null;
       
       System.gc();
       
       System.out.println("End of main");
      

    }
}