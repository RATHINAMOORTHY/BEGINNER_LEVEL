class oddbetweeen
{
  public static void main(String args[])
  {
    int a=Integer.valueOf(args[0]);
    int b=Integer.valueOf(args[1]);
    for(int i=a;i<=b;i++)
    {
      if(i%2!=0)
      {
        System.out.println(+i);
      }
    }
  }
}

