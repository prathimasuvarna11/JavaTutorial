import java.util.Scanner;

public class Demo {
	
	public String reverseString(String s)
	{   
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		return rev;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=sc.next();
		Demo d= new Demo();
		String rev1=d.reverseString(s1);
		System.out.println("Reversed string: "+rev1);

	}

}
