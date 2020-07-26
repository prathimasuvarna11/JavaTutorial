import java.util.Scanner;

public class Demo4 {
	
	
	public String reverseString(String name)
	{
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		if(rev.equalsIgnoreCase(name))
		{
			System.out.println(name+" is palindrome");
		}
		else
		{
			System.out.println(name+" is not palindrome");
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		Demo4 d=new Demo4();
		String rev=d.reverseString(s);
		System.out.println("Reversed string "+rev);

	}

}
