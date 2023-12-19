import java.io.*;
import java.util.*;
class hollowRectangle
{
     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of rectangle: ");
        int length = sc.nextInt();
        System.out.println("enter the breadth of rectangle: ");
        int breadth = sc.nextInt();
        int i,j;
        for(i=0;i<breadth;i++)
        {
            for(j=0;j<length;j++)
            {
               if(i==0||i==breadth-1||j==0||j==length-1)
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
