import java.io.*;
import java.util.*;
class college
{
    public static void main(String[]args)
    {
      try
      {
        Scanner sc = new Scanner(System.in);
        int t,s,su,su1,ns;
        System.out.println("Total Users: ");
        t=sc.nextInt();
        System.out.println("Staff Users: ");
        s=sc.nextInt();
        if(t<=0||s<=0)
        {
           System.out.println("negative/null value not accepted");
        }
        if(t<=s)
        {
            System.out.println("please enter the valid no.of users: ");
        }
        else
        {
           su=t-s-(s/3);
           System.out.println("student users: "+su);
        }
      }
      catch(Exception e)          
      {
         System.out.println("floating point/string exception");
      }
    }
}