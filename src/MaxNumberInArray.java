
public class MaxNumberInArray {

	public static void main(String[] args) {
		int array[][]= {{7,0,8,4},{2,9,11,6},{3,5,10,-1}};
		int max=array[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(array[i][j]>max)
				{
					max=array[i][j];
				}
			}
		}
		
     System.out.println(max);
	}

}
