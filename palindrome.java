import java.util.*;
class palindrome
{
  public static void main(String args[])
  {
    StringBuffer sb=new StringBuffer(args[0]);
    sb.reverse();
    String s=new String(sb);
	
    
    if(s.equalsIgnoreCase(args[0]))
      System.out.print("PALINDROME");
    else
      System.out.print("NOT PALINDROME");
  }
}
