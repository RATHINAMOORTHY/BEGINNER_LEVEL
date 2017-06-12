import java.util.Scanner;
class beginner17{  
  public static void main(String[] args)  {  
	Scanner in=new Scanner(System.in);
	System.out.println("ENTER THE NUMBER");
	int n=in.nextInt();
    int temp;   
    temp=n;  
    int c=0,a;
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println("IT IS AN ARMSTRONG NUMBER");   
    else  
    System.out.println("IT IS NOT AN ARMSTRONG NUMBER");   
   }  
}  
