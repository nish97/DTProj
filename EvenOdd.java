import java.util.*;
class display
{
  int dis(int [] a,int l)
  {
     int i;
     for(i=0;i<l;i++)
     {
       System.out.println(a[i]);
     }
     return 0;
  }
}
class EvenOdd extends display 
{
 public static void main(String args[])
 {
    int [] arr = new int [20];
    int [] even = new int [20];
    int [] odd = new int[20];
    int i,j=0,k=0,n;
    Scanner s = new Scanner(System.in);
    display d = new display();
    System.out.println("Enter number of elements: ");
    n =s.nextInt();
    System.out.println("Enter the elements: ");
     for(i=0;i<n;i++)
     {
      arr[i] = s.nextInt();
      if(arr[i]%2==0)
       {
          even[j]=arr[i];
          j++;
       }
      else
        {  
          odd[k]=arr[i];
          k++; 
        }
     }
    System.out.println("Enter number of even elements:"+j);
    System.out.println("Enter even elements: ");
    d.dis(even,j);
    System.out.println("Enter number of odd elements: "+k); 
    d.dis(odd,k);
    }
 }
