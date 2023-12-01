import java.io.*;
import java.util.*;
class palindrome
{
   public static void main(String[]args)
   {
     try
     {
       int a,rev=0,rem,choice,l,d,i;
       String s,t="";
       Scanner sc = new Scanner(System.in);
       System.out.println("case:");
       choice=sc.nextInt();
       switch(choice)
       {
         case 1:
         {
             System.out.println("enter the string: ");
             s=sc.next(); 
             l=s.length();
             for(i=0;i<l;i++) 
             {
                t=t+s.charAt(i);
             }
             if(s.equals(t))
             {
                 System.out.println("PALINDROME");
             }
             else
             {
                 System.out.println("NOT A PALINDROME");
             }
            break;
         }
         case 2:
         {
             System.out.println("enter a number :");
             a=sc.nextInt();
             int temp=a;
             while(a!=0)
             {
                rem=a%10;
                rev=(rev*10)+rem;
                a=a/10;
             }
             if(temp == rev)
             {
                 System.out.println("PALINDROME");
             }
             else
             {
                 System.out.println("NOT A PALIMDROME");
             }
            break; 
         }
         default:
         {
             System.out.println("Executed");
         }
       }
     }  
     catch(Exception e)
     {
        System.out.println("enter only numbers: ");
     }
  }
}    
       

       

