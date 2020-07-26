import java.util.Scanner;

public class CountWordsInSentence {
	
	public void count(String s)
	{
		String[] ref=s.split(" ");
		System.out.println("Number of words:"+ref.length);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sen=sc.nextLine();
		CountWordsInSentence c=new CountWordsInSentence();
		c.count(sen);

	}

}
