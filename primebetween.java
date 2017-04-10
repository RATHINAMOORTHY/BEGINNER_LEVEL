class primebetween
{ public static void main(String args[])
  {
    int a=Integer.valueOf(args[0]);
    int b=Integer.valueOf(args[1]);
    for(int i=a;i<=b;i++)
    {
      func(i);
	}
  }
 public static void func(int n)
  {
	  int flag=0;
	  int m=n/2;
	  for(int i=2;i<=m;i++)
	  {
		  if(n%i==0)
		  {   flag=1;
			  break;
		  }
	  }
	  if(flag==0)
		  System.out.println(+n);
  }
		  
}
