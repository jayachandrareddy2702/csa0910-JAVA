import java.io.*;
import java.util.*;
class diamond
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the no.of rows: ");
     int rows = sc.nextInt();
     int i,j,k;
     for(i=1;i<=rows;i++)
     {
         for(j=rows-1;j>=i;j--)
         {
            System.out.print(" ");
         }
         for(k=0;k<(2*i-1);k++)
         {
            System.out.print("*");
         }
       System.out.println();
    }
    for(i=rows-1;i>=0;i--)
    {
         for(j=rows-1;j>=i;j--)
         {
            System.out.print(" ");
         }
         for(k=(2*i-1);k>=1;k--)
         {
            System.out.print("*");
         }
      System.out.println();
    }
    
  }
}
    
