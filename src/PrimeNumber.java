import java.util.Scanner;

public class PrimeNumber {
	
	
	public boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
			
		}
		return true;
	}
	
	public void getPrimeNumber(int num)
	{
		for(int i=2;i<=num;i++)
		{ 
			if(isPrimeNumber(i))
			{
				System.out.print(i+"\t");
				
			}
			
		}System.out.print("Prime Numbers");
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		
		PrimeNumber p=new PrimeNumber();
		System.out.println(n+" is a prime number: "+p.isPrimeNumber(n));
		
		p.getPrimeNumber(n);
		
		
		/*
		 * System.out.println("2 is a prime number "+p.isPrimeNumber(2));
		 * System.out.println("3 is a prime number "+p.isPrimeNumber(3));
		 * System.out.println("4 is a prime number "+p.isPrimeNumber(4));
		 */
	
		

	}

}
