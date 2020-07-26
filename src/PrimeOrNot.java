
public class PrimeOrNot {

	public static void main(String[] args) {
		int num=19;
		boolean b=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(num+" is not prime");
				b=false;
				break;
			}
		}
		if(b==true)
		{
			System.out.println(num+" is prime");
		}

	}

}
