import java.util.Scanner;

public class PrintNumbersAndChars {
	
	
	public void printNumsAndChars(String s)
	{
		String chars="",nums="",symbs="";
		for(int i=0;i<s.length();i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
			{
				chars=chars+s.charAt(i);
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				nums=nums+s.charAt(i);
			}
			else 
			{
				symbs=symbs+s.charAt(i);
			}

			
		}
		
		System.out.println(chars);
		System.out.println(nums);
		System.out.println(symbs);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		PrintNumbersAndChars p=new PrintNumbersAndChars();
		p.printNumsAndChars(s);

	}

}
