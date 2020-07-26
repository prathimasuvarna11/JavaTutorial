import java.util.Scanner;

public class FactorialUsingRecurssion {
	
	
	public int factorial(int num)
	{
		int fact=1;
		if(num==0)
			return 1;
		else
			return num*factorial(num-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		FactorialUsingRecurssion f=new FactorialUsingRecurssion();
		int number=f.factorial(n);
		System.out.println("Factorial is:"+number);

	}

}
