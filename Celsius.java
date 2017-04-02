import java.util.*;
class Celsius
{
  public static void main(String args[])
  {
    int c;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the temperature in celsius:");
    c = s.nextInt();
    System.out.println("the fahrenheit conversion of"+c+"is"+(c*1.8+32));
  }
}