import java.util.Scanner;

public class Demo1 {
	
	
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
		}return true;
		
	}

	public void getPrimeNumber(int num)
	{
		for(int i=2;i<=num;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.print(i+"\t");
			}
		}System.out.print("Prime numbers");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		Demo1 d=new Demo1();
		System.out.println(n+" is a prime number: "+d.isPrimeNumber(n));
		d.getPrimeNumber(n);
		
	}

}
