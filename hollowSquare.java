import java.util.*;
import java.io.*;
class hollowSquare
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the no.of rows");
       int size = sc.nextInt();
       int i,j;
       for(i=0;i<size;i++)
       {
          for(j=0;j<size;j++)
          {
              if(i==0||i==size-1||j==0||j==size-1)
              {
                 System.out.print("*");
              } 
              else
              {
                System.out.print(" ");
              }
           }
        System.out.println();
       }
   }
}
