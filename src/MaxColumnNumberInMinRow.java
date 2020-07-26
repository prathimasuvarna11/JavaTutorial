
public class MaxColumnNumberInMinRow {

	public static void main(String[] args) {
		int array[][]= {{5,8,1,6},{3,9,2,7},{11,4,10,0}};
		int min=array[0][0];
		int minColumn=0;
		int k=0;
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(array[i][j]);
				System.out.print("\t");
				if(array[i][j]<min)
				{
					min=array[i][j];
					minColumn=j;
				}
			}
			System.out.println();
		}
	int max=array[0][minColumn];
    while(k<3)
    {
    	if(array[k][minColumn]>max)
    	{
    		max=array[k][minColumn];
    	}
    	k++;
    }
    System.out.println(minColumn);
    System.out.println(min);
    System.out.println(max);
	}

}
