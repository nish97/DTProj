import java.util.*;
class Calc
{
	int reverse(int a)
	{
       int b=0,r;
       while(a>0)
       {
        r=a%10;
        b=b*10+r;
        a=a/10;
       }
       return b;	
	}
}
class Adam extends Calc
{
	public static void main(String args[])
	{
	  int x,y,z,t;
	  Scanner a=new Scanner(System.in);
	  System.out.println("enter the number");
      x=a.nextInt();
      z=x*x;
      Calc c=new Calc();
      t=c.reverse(z);
      y=c.reverse(x);
      if(Math.pow(y,2)==t)
        {
    	   System.out.println("The entered number "+x+" is a Adam number");
        }
      else
        { 		 
    	   System.out.println("The number "+x+" is not a Adam number"); 
        }
    }
} 