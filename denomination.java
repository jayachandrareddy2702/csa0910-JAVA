import java.io.*;
import java.util.*;
class denomination
{
   public static void main(String[]args)
   {
     try
     {
       Scanner sc = new Scanner(System.in);
       int arr[]={100,200,500,2000};
       System.out.println("Enter the 1st denomination: ");
       int a = sc.nextInt();
       System.out.println("Enter the no.of notes in 1st denomination: ");
       int a1= sc.nextInt();
       System.out.println("Enter the 2nd denomination: ");
       int b = sc.nextInt();
       System.out.println("Enter the no.of notes in 2nd denomination: ");
       int b1 = sc.nextInt();
       System.out.println("Enter the 3rd denomination: ");
       int c = sc.nextInt();
       System.out.println("Enter the no.of notes in 3rd denomination: ");
       int c1 = sc.nextInt();
       System.out.println("Enter the 4th denomination: ");
       int d = sc.nextInt();
       System.out.println("Enter the no.of notes in 4th denomination: ");
       int d1 = sc.nextInt();
       if((a==100||a==200||a==500||a==2000)&&(b==100||b==200||b==500||b==2000) && (c==100||c==200||c==500||c==2000) && (d==100||d==200||d==500||d==2000))
       {
          int e = (a*a1)+(b*b1)+(c*c1)+(d*d1);
          System.out.println("Total balance available in ATM is: "+e); 
       }
       else
       {
          System.out.println("enter the denomination correctly! ");
       }
     }
     catch(Exception e)
     {
         System.out.println("enter the correct denomination! ");
     }
   }
}
