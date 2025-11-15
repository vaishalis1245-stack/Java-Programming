////////////////////////////////////////////////////////////////
// Ya code madhe synchronized keyword use nhi kela 
//tar ya code madhe 4 cha ani 5 cha table ha serially run na hota without sequance ne run hot ahe 
//ani tyach sathi synchronized cha vapar pudachya program madhe kela ahe
//ithe first and second ase don object chya parameter madhe nava ghetale ahet ani 4 ani 5 cha table display
//kela ahe 
//
//
///////////////////////////////////////////////////////////////




class TablePrinter
{
    public void PrintTable(int n)
    {
        int i = 0;

        for(i = 1; i <= 10; i++)
        {
            System.out.println("Name :"+Thread.currentThread().getName()+":"+n*i);
        }
    }
}

class Demo extends Thread
{
        public TablePrinter tobj;
        public int no;

        public Demo(TablePrinter t,int n,String name)
        {
           tobj = t;
           no = n;
           setName(name);   
        }
        public void run()
        {
            tobj.PrintTable(no);
        }

    
    }


class ThreadUserDefinedSynchronisedX
{
    public static void main(String A[])
    {

       TablePrinter tobj = new TablePrinter();

       Demo dobj1 = new Demo(tobj,4,"First");
        Demo dobj2 = new Demo(tobj,5,"Second");

        dobj1.start();
        dobj2.start();
        
        try
        {
        dobj1.join();
        dobj2.join();
        }
        catch(InterruptedException iobj)
        {}
}
}