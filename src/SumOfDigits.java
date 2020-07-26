import java.util.Scanner;

public class SumOfDigits {
	
	
	public int sumOfDigits(int num)
	{
		int r,sum=0;
		while(num>0)
		{
		r=num%10;
		sum=sum+r;
		num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		SumOfDigits s=new SumOfDigits();
		int sum=s.sumOfDigits(n);
		System.out.println(sum);

	}

}
