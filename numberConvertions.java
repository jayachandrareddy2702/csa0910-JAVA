import java.io.*;
import java.util.*;
class numberConvertions
{
   public static void main(String[]args)
   {
      try
      {
         String num;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number: ");
         num = sc.nextLine();
         int decimal;
         decimal=Integer.parseInt(num,2);
         String octal=Integer.toOctalString(decimal);
         String hexadecimal = Integer.toHexString(decimal);
         System.out.println("Decimal value is: "+decimal);
         System.out.println("Octal value is: "+octal);
         System.out.println("Hexa decimal value is: "+hexadecimal);
      }
      catch(Exception e)
      {
           System.out.println("Due to chatracter exception");
      }
   }
}
         
         
         
                 
      