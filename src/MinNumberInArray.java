
public class MinNumberInArray {

	public static void main(String[] args) {
		int array[][]= {{4,8,2,11},{10,6,9,3},{5,1,7,0}};
		int min=array[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(array[i][j]);
				System.out.print("\t");
				if(array[i][j]<min)
				{
					min=array[i][j];
					
					
				}
			}
			System.out.println();
			
		}
		
		System.out.println(min);
	}
	
}
