import java.io.*;
import java.util.*;
class invertedMirrorRightTriangle
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the no.of rows: ");
       int n =sc.nextInt();
       int i,j;
       for(i=0;i<n;i++)
       { 
          for(j=0;j<i;j++)
          {
             System.out.print(" ");
          }
          for(j=i;j<n;j++)
          {
             System.out.print("*");
          }
        System.out.println();
       }
    }
}
