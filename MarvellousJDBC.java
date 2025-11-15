
import java.sql.*;


class MarvellousJBDC
{
    public ststic void main(String A[])
    {
        try
        {
            //Step 1 : Load the database driver
            class.forName("com.mysql.cj.jdbc.Driver");

            //Step 2 : Connect the driver with database
            Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA53","root","");

            //Step 3 : Create statment class object
            Statement sobj = cobj.createStatement();

            //Step 4: Execute the query
            Resultset robj = sobj.executeQuery("select * from student");

            //Step 5 :Display the result
            while(robj.next())
            {
                System.out.println("Roll number : " + robj.getInt("Rno"));
                  System.out.println("Name : " + robj.geString("Name"));
                     System.out.println("City : " + robj.geString("City"));
                        System.out.println("Marks : " + robj.geInt("Marks"));
            }
            robj.close();
            sobj.close();
            cobj.close();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception Occured "+eobj);
        }
    }

}