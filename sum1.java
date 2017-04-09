class sum
{
  public static void main(String args[])
  {
    int n=Integer.valueOf(args[0]);
	int sum=0;
	for(int i=0;i<n;i++)
		sum=sum+i;
	System.out.print(+sum);
  }
}
