import java.io.*;
import java.util.*;
class Factors_Of_A_Number
{
  public static void main(String[] args)
  {
   int factors[]=new int[50];
   int n,count=0,i,j=0;
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the number: ");
   n = sc.nextInt();
   for(i=1;i<=n;i++)
   { 
      if(n%i==0)
      {
        count++;
        factors[j] = i;
        j++;
      }
   }
   System.out.println(" the number of factors for number "+n+" are : "+count);
   System.out.println(" the factors of the number are : ");
   for(i=0;i<count;i++)
   {
      System.out.print(factors[i]+" ");
   }
  }
}
