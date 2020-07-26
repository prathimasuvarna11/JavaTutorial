import java.util.Scanner;

public class ReverseEvenWord {
	
	
	public String reverseEvenIndex(String sentence)
	{
		String rev="";
		String[] words=sentence.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(i%2==1)
			{
			  rev=rev+" "+reverse(words[i]);
			  
			}
			else
			{
				rev=rev+" "+words[i];
			}
		}
		return rev;
	}
	
	public String reverse(String word)
	{
		StringBuilder sb=new StringBuilder(word);
		String revString=sb.reverse().toString();
		return revString;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentense");
		String s=sc.nextLine();
		ReverseEvenWord r=new ReverseEvenWord();
		String revSt=r.reverseEvenIndex(s);
		System.out.println(revSt);
		

	}

}
