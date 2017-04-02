import java.util.*;
class ArrSum
{
  public static void main(String args[])
  {
     int a=0,i,n;
     int [] x = new int [20];
     Scanner s = new Scanner(System.in);
     System.out.println("Enter number of elements:");
     n = s.nextInt();
     System.out.println("Enter the array elements:");
     for(i=0;i<n;i++)
     {
        x[i] = s.nextInt();
        a+=x[i];
     }
     System.out.println("The sum of the array elements is"+a); 
  }
}