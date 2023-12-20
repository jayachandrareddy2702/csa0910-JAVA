import java.io.*;
import java.util.*;
class conversions
{
   public static void main(String[] args)
   {
         int num;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number");
         num = sc.nextInt();
         String binary =Integer.toBinaryString(num);
         String octal =Integer.toOctalString(num);
         String hexadecimal = Integer.toHexString(num);
         System.out.println("binary value is: "+binary);
         System.out.println("octal value is: "+octal);
         System.out.println("hexadecimal value is: "+hexadecimal);
   }
}
