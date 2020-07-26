
public class DiamondPattern {
	
	public void pattern()
	{
		int l=5,sp=l/2,st=1;
		int mid=(l/2)+1;
		for(int i=1;i<=l;i++)
		{
			for(int s=1;s<=sp;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<mid)
			{
				st=st+2;
				sp--;
			}
			else
			{
				st=st-2;
				sp++;
			}
		}
	}

	public static void main(String[] args) {
		
		DiamondPattern d= new DiamondPattern();
		d.pattern();

	}

}
