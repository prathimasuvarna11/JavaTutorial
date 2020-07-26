import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateWordsInString {
	
	
	public void duplicateWords(String inputString)
	{
		String words[]=inputString.split(" ");
		Map<String,Integer> wordCount= new HashMap<String,Integer>();
		for(String word:words)
		{
			if(wordCount.containsKey(word))
			{
				wordCount.put(word.toLowerCase(), wordCount.get(word)+1);
			}
			else
			{
				wordCount.put(word, 1);
			}
		}
		
		Set<String> wordInString = wordCount.keySet();
		for(String word:wordInString)
		{
			if(wordCount.get(word)>1)
			{
				System.out.println(word+":"+wordCount.get(word));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		DuplicateWordsInString d = new DuplicateWordsInString();
		d.duplicateWords(s);

	}

}
