
class Base //8 byte
{
    public int i,j;

    public void fun()
    {
        System.out.println("Inside base fun");
    }
}

class Derived extends Base //12 byte
{
    public int x;

    public void gun()
    {
        System.out.println("Inside Derived Gun");
    }
}

class Single
{
    public static void main(String A[])
    {
       Base bobj = new Base();
       Derived dobj = new Derived();

       bobj.fun();

       dobj.fun(); //father's sun gadi
       dobj.gun(); //son's gadi
    }
}
