import java.util.ArrayList;

public class ArrayListUniqueNumber {

	public static void main(String[] args) {
		int array[] = {6,7,8,7,6,9,6,8,7};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<array.length;i++)
		{
			int k=0;
			
			
			if(!al.contains(array[i]))
			{
				al.add(array[i]);
				k++;
				
				for(int j=i+1;j<array.length;j++)
				{
					if(array[i]==array[j])
					{
						k++;
						
					}
					
				}
				System.out.println(array[i]+" "+ k);
				if(k==1)
				{
					System.out.println(array[i] + " is unique");
				}
			}
			
		}
		

	}

}
