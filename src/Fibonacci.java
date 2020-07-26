
public class Fibonacci {

	public static void main(String[] args) {
		int a=0,b=1;
		for(int i=1;i<=20;i++)
		{
			System.out.println("Fibonacci searies:"+a);
			a=a+b;
			b=a-b;
		}
				

	}

}
