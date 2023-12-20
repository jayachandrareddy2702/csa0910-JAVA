import java.io.*;
import java.util.*;
class elementFrequency
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of array: ");
      int size = sc.nextInt();
      int[] arr = new int[size];
      System.out.println("enter the elements of array: ");
      for(int i=0;i<size;i++)
      {
         System.out.println("Element "+(i+1)+":");
         arr[i]=sc.nextInt();
      }
      System.out.println("\n Frequency of each element: ");
      for(int i=0;i<size;i++)
      {
         if(arr[i] ==-1)
         {
              continue;
         }
         int count=1;
         for(int j=i+1;j<size;j++)
         {
            if(arr[i] == arr[j])
            {
               count++;
               arr[j] = -1;
            }
         }
         System.out.println("Element "+arr[i]+":"+count+" times.");
     }
  }
}
