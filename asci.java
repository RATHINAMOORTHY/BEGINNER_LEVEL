class asci
{
  public static void main(String args[])
  {
    char[] c=args[0].toCharArray();
    for(int i=0;i<args[0].length;i++)
    {
      System.out.println(+(int)c[i]);
    }
  }
}
