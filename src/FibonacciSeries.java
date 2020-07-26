import java.util.Scanner;

public class FibonacciSeries {
	
	public void fibonacci(int num)
	{
		int a=0,b=1;
		for(int i=1;i<=num;i++)
		{
			System.out.println("Fibonacci series:"+a);
			a=a+b;
			b=a-b;
		
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		FibonacciSeries f=new FibonacciSeries();
		f.fibonacci(n);

	}

}
