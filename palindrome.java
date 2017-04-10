import java.util.*;
class palindrome
{
  public static void main(String args[])
  {
    StringBuffer sb=new StringBuffer(args[0]);
    if(sb.reverse()==args[0])
      System.out.print("PALINDROME");
    else
      System.out.print("NOT PALINDROME");
  }
}
