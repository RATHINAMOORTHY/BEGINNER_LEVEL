import java.math.*;
class largeofthree
{
  public static void main(String args[])
  {
    int a=Integer.valueOf(args[0]);
    int b=Integer.valueOf(args[1]);
    int c=Integer.valueOf(args[2]);
    System.out.print(Math.min(Math.min(a,b),c));
  }
}
