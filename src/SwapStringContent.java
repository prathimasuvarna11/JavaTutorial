import java.util.Scanner;

public class SwapStringContent {
	
	public void swap(String s)
	{
		System.out.println(s);
		String[] ref=s.split(" ");
		System.out.println(ref[2]+" "+ref[1]+" "+ref[0]);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		SwapStringContent ss=new SwapStringContent();
		ss.swap(s);
		

	}

}
