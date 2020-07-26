import java.util.Scanner;

public class DuplicateCharacters {
	
	public void occurencesOfCharacter(String rv,char ch)
	{
		int count=0;
		
		for(int i=0;i<rv.length();i++)
		{
			if(rv.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+" count = "+count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.next();
		System.out.println("Enter a character");
		char c=sc.next().charAt(0);
		DuplicateCharacters d= new DuplicateCharacters();
		d.occurencesOfCharacter(s,c);
		

	}

}
