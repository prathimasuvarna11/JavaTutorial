
public class Practice {

	public static void main(String[] args) {
		
		int array[][] = {{2,6,8,7},{4,9,15,-5},{5,10,3,-11}};
		int min=array[0][0];
		for(int i=0;i<=array.length-1;i++)
		{
			for(int j=0;j<=array[0].length-1;j++)
			{
				if(array[i][j]<min)
				{
					min=array[i][j];
				}
			}
		}
		
		System.out.println(min);
	}

}
