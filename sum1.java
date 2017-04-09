import java.util.*;
class sum1
{
  public static void main(String args[])
  {
	  System.out.print("ENTER THE LIMIT");
	  Scanner in=new Scanner(System.in);
            int n=in.nextInt();
	int sum=0;
	for(int i=0;i<n;i++)
		sum=sum+i;
	System.out.print(+sum);
  }
}
