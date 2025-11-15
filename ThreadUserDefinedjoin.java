class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside run method of :"+Thread.currentThread().getName());
    }
}


class ThreadUserDefinedjoin
{
    public static void main(String A[])
    {
       System.out.println("Inside main");

       Demo dobj1 = new Demo();
       Demo dobj2 = new Demo();

       dobj1.setName("First");
       dobj2.setName("second");

       dobj1.start();
       dobj2.start();

       System.out.println("End of main thread");
    }
}