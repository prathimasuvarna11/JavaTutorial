import java.util.Scanner;

public class ReverseaNumber {
	
	
	public int numberReverse(int num)
	{
		int rev=0;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			rev=num%10;
			sum=(sum*10)+rev;
			num=num/10;
			
			
		}
		
		if(temp==sum)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not palindrome");
		}
		return sum;
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		ReverseaNumber r=new ReverseaNumber();
		int rn=r.numberReverse(n);
		System.out.println("Reversed number "+rn);
		

	}

}
