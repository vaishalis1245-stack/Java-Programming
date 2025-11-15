class Hello
{
    public int i; //non static 

    public Hello(int no)
    {
        System.out.println("Inside Hello Constructor");
        this.i=no+1;

        public void display()
        {
            System.out.println("Inside Hello Display");
        }
    }
}

class Demo extends Hello //single level inheritance
{
   public int i; //non static data 
   

   public Demo(int a) 
   {
    super(a); //first use
     System.out.println("Inside Demo Constructor");
    this.i=a;  //First Use
   }

   public void display()
   {
    int i=0;
    System.out.println("Inside Display"+i);
    System.out.println("Inside Display"+this.i); 
    System.out.println("Inside Display"+super.i); //second use
    super.display(); //third use
   }
}

class SuperDemo
{
    public static void main (String A[])
    {
       Demo dobj = new Demo(51);
       dobj.display();
    }
}