class prime
{
  public static void main(String args[])
  {
    int flag=0;
    int a=Integer.valueOf(args[0]);
    int b=a/2;
    for(int i=0;i<b;i++)
    {
      if(a%i==0)
      {
        flag=1;
        System.out.print("NOT PRIME");
        break;
      }
    }
    if(flag==0)
    {
       System.out.print("PRIME");
    }
  }
}
      
      
