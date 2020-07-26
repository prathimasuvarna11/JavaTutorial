import java.util.Scanner;

public class ReverseSentence {
	
	
	public String reverse(String sentence)
	{
		String rev="";
		String[] words=sentence.split("");
		for(int i=words.length-1;i>=0;i--)
		{
			rev=rev+words[i];
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
		ReverseSentence r=new ReverseSentence();
		String revSt=r.reverse(s);
		System.out.println(revSt);

	}

}
