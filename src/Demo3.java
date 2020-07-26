import java.util.Scanner;

public class Demo3 {
	
	public int reverseNumber(int num)
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
			System.out.println(temp+" is palindrome");
		}
		else
		{
			System.out.println(temp+" is not palindrome");
		}
		return sum;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		Demo3 d= new Demo3();
		int rev=d.reverseNumber(n);
		System.out.println("Reversed number "+rev);

	}

}
