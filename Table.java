import java.util.*;
class Table
{
  public static void main(String args[])
  {
   int i=1,a,n=10;
   String ch;
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the Table number:"); 
   a = s.nextInt();
   do
    {  
       for(;;i++)
        {
          System.out.println(i+"x"+a+"="+(i*a));
          if(i==n)
          break;    
        }
       System.out.println("Do you want to extend table(yes/no):");
       ch = s.next();
       n+=10;
       i+=1;    
    }while(ch.equals("yes"));
}
}