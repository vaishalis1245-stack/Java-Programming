class Arithmatic
{
    public int ino1;
    public int ino2;

    public Arithmatic()
    {
        this.ino1=0;
        this.ino2=0;
    }
    public Arithmatic(int i,int j)
    {
       this.ino1 =i;
       this.ino2=j; 
    }
    public int Addition()
    {
        int ians = 0;
        ians = this.ino1 + this.ino2;
        return ians;
    }
     public int Substraction()
    {
        int ians = 0;
        ians = this.ino1 - this.ino2;
        return ians;
    }

}

class OOPX
{

    public static void main(String Arg[])
    {
      Arithmatic aobj1 = new Arithmatic(11,10);
       int iret=0;

       iret=aobj1.Addition();
       System.out.println("Addition is :"+iret); 

       iret=aobj1.Substraction();
       System.out.println("Substraction is :"+iret);

       aobj1=null;
              

    }
}2