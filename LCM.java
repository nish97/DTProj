import java.util.*;
class LCM
{
  public static void main(String args[])
  {
     int x,y,m,n;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the two numbers");
     x = s.nextInt();
     y = s.nextInt();
     m=x;
     n=y;
     while(m!=n)
     {
        if(m<n)
        {
           m+=x;
        }
        else
           n+=y;
     }
     System.out.println("the LCM of"+x+" and "+y+"is "+m); 
  }
}