class Demo
{
   public int i; //non static data 
   public static int j;
   
   static //static block
   {
     j=21;
   }

   public Demo() // Deafult constructor
   {
     System.out.println("Inside Default Constructor");
    this.i=11;  //First Use
   }

   public Demo(int a) //parameterised constructor
   {  
      this(); //only aaplicable at first line of constructor //Second use
      System.out.println("Inside parameterised Constructor");
   }

   public void display()
   {
    System.out.println("Inside Display"+this.i); //Third Use
   }
}

class ThisDemo
{
    public static void main (String A[])
    {
       Demo dobj = new Demo(51);
       dobj.display();

    }
}