import java.util.Scanner;

public class ReverseStringContent{
	
	public void reverse(String sentence)
	{
		String[] words=sentence.split("");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
			
			
		}
	}
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		ReverseStringContent r =new ReverseStringContent();
		r.reverse(s);

	}

}
