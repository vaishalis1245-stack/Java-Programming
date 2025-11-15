
abstract class Base
{
  public int i,j;
  public int Addition(int a,int b)
  {
    return a+b;
  }
 abstract public int Substraction(int a,int b);

}
class Derived extends Base 
{
    public int substraction(int a,int b)
    {
        return a-b;
    }

    public int multi(int a,int b)
    {
        return a*b;
    }
}

Abstractdemo3
{
   public static void main(String A[])
   {
    Base * bp = new Derived(); 

    int iret=0;

    iret= bp.Addition(11,10);
    System.out.println(iret);
    iret= bp.substraction(11,10);
    System.out.println(iret); 
    iret= bp.multi(11,10); //error

    
    
   }

}