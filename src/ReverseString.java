
public class ReverseString {

	public static void main(String[] args) {
		String str="Prathima";
		String temp="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
			
		}
		
		System.out.println(temp);
		if(str.equals(temp))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
