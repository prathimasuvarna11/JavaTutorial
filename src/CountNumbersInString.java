import java.util.Scanner;

public class CountNumbersInString {
	
	public int countNumbers(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		CountNumbersInString c=new CountNumbersInString();
		int count=c.countNumbers(s);
		System.out.println("Count="+count);

	}

}
