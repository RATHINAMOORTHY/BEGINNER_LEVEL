class primebetween
{
  public static void main(String args[])
  {
    int a=Integer.valueOf(args[0]);
    int b=Integer.valueOf(args[1]);
    for(int i=a;i<=b;i++)
    {
      int n=i;
      int m=n/2;
      for(int j=2;j<=m;j++)
      {
        if(n%j!=0)
        {
          System..out.println(+j);
        }
      }
    }
  }
}
          
