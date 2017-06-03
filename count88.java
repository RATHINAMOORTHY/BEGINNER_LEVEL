import java.util.Scanner;

public class count88 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
    	System.out.println("ENTER THE STRING");
   		String s=in.nextLine();
   		char[] c=s.toCharArray();
   		int sum=0,i;
   		for(i=0;i<s.length();i++)
   		{
   			if(Character.isLetter(c[i]))
   			{
   				sum++;
   			}
   		}
   		
   		
   			System.out.print(+sum);

	}

}

