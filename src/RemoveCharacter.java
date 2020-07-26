import java.util.Scanner;

public class RemoveCharacter {
	
	public void remove(String s,int num)
	{
		String rv1=s.substring(0, num);
		String rv2=s.substring(num+1);
		System.out.println(rv1+rv2);
	}

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a String");
       String s1=sc.next();
       System.out.println("Enter a number");
       int n=sc.nextInt();
       RemoveCharacter r=new RemoveCharacter();
       r.remove(s1, n);
       
	}

}
