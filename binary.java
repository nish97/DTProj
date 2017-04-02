import java.util.*;
class Calc
{
	int reverse(int a)
	{
       int b=0,r,i=0;
       while(a>0)
       {
        r=a%10;
        b+=Math.pow(2,i)*r;
        a=a/10;
        i++;
       }
       return b;	
	}
}
class binary extends Calc 
{
public static void main(String args[])
 {
     int ch,r;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the binary number");
     ch = s.nextInt();
     Calc c = new Calc();   
     r = c.reverse(ch); 
     System.out.println("The decimal value of"+ch+" is "+r);
}
}