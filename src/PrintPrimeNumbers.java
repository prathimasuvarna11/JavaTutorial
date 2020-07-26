
public class PrintPrimeNumbers {

	public static void main(String[] args) {
		int i,p,n=20,j;
		for(i=1;i<=n;i++)
		{
			p=1;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					p=0;
				}
			}
			if(p==1)
			{
				System.out.println("Prime numbers:"+i);
			}
		}

	}

}
