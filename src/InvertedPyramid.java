
public class InvertedPyramid {

	public static void main(String[] args) {
		int k=10;
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j>=1;j--) {
				System.out.print(k);
				System.out.print("\t");
				k--;
				
			}
			System.out.println();
		}

	}

}
