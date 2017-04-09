import java.util.*;
class vowel
{
  public static void main(String args[]) {
    System.out.println("ENTER A CHARACTER");
    Scanner in=new Scanner(System.in);
    String c=in.nextLine();
    if(c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i")||c.equalsIgnoreCase("o")||c.equalsIgnoreCase("u"))
    System.out.println("VOWEL");
    else
     System.out.println("NOT VOWEL");
      
  }
}
