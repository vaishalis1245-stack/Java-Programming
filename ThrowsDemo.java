class Demo
{
    public int Division(int no1,int no2) throws ArithmaticException
    {
        int ans=0;
        ans = no1/no2;
        return ans;
    }
}

class ThrowsDemo
{
    public static void main(String A[])
    {
       Demo obj = new Demo();

       int ret = 0;
       try
       {
       ret = obj.Division(11,0);
       }
       catch(ArithmaticException aobj)
       {
         System.out.println("Inside catch :"+aobj);
       }
       System.out.println("Division is : "+ret);
    }
}