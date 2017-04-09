import java.math.*;
class leapyear
{
  public static void main(String args[])
  {
    int a=Integer.valueOf(args[0]);
    if(a%4==0||a%400==0)
		System.out.print("Leap year");
	else
		System.out.print("Not a Leap Year");
  }
}
