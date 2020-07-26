import java.util.Scanner;

public class FactorialUsingForLoop {
	
	public int factorial(int num)
	{
		int fact=1;
		
		if(num==0)
			return 1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		return fact;
		
		
	}
	


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		FactorialUsingForLoop f=new FactorialUsingForLoop();
		int number=f.factorial(n);
		System.out.println("Factorial is:"+number);

	}

}
