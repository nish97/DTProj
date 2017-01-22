import java.util.*;
class Table
{
public static void main(String args[])
{
int n,x=0,i,y;
Scanner s=new Scanner(System.in);
System.out.println("enter the table number:");
n=s.nextInt();
Scanner t=new Scanner(System.in);
System.out.println("enter the range:");
y=t.nextInt();
for(i=1;i<=y;i++)
{
x=n*i;
System.out.println(n+ "X" +i+"=" +x);
}
}
}