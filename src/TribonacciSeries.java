import java.util.Scanner;

public class TribonacciSeries {
	
	public void tribonacci(int num)
	{
		int a=0,b=1,c=0;
		
		  System.out.println(a); 
		  System.out.println(b); 
		  System.out.println(c);
		 
		for(int i=1;i<=num;i++)
		{
			
			  int res=a+b+c; 
			  System.out.println(res);
			 
			
			
			
			  a=b; 
			  b=c; 
			  c=res;
			 
			
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		TribonacciSeries t=new TribonacciSeries();
		t.tribonacci(n);

	}

}
