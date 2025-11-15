class Demo
{
  public int i;       //Instance Variable
  static public int j  ; //Class Variable

  static
  {
    j=21;
    System.out.println("Inside Sataic Block");
  }
  
  public Demo() //Constructor
  {
    this.i = 11;
    System.out.println("Inside constructor");
  }

  
}

class Blocks
{
    public static void main(String A[])
    {   
       System.out.println("Inside Main");
       Demo dobj1 = new Demo(); //object in java //Demo dobj; this is a reference of java means the pointer in c++
       Demo dobj2 = new Demo();
       Demo dobj3 = new Demo();
    }
}