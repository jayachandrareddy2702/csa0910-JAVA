import java.io.*;
import java.util.*;
class factorial
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number: ");
       int n = sc.nextInt();
       int fact=1,i;
       for(i=1;i<=n;i++)
       {
         fact=fact*i;
       }
       System.out.println("the factorial of "+n+" is : "+fact);
    }
}

