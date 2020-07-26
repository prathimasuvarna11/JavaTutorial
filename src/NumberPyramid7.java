
public class NumberPyramid7 {

	public static void main(String[] args) {
		int k=3;
		for(int i=1;i<=3;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
			}
			System.out.println();
		}

	}

}
