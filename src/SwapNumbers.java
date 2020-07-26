
public class SwapNumbers {
	int i;
	static void swap(SwapNumbers s1,SwapNumbers s2)
	{
		int temp=s1.i;
		s1.i=s2.i;
		s2.i=temp;
		
	}

	public static void main(String[] args) {
		SwapNumbers rv1=new SwapNumbers();
		SwapNumbers rv2=new SwapNumbers();
		rv1.i=10;
		rv2.i=20;
		System.out.println("Before swaping");
		System.out.println("rv1="+rv1.i);
		System.out.println("rv2="+rv2.i);
		swap(rv1,rv2);
		System.out.println("After swaping");
		System.out.println("rv1="+rv1.i);
		System.out.println("rv2="+rv2.i);
				
	}

}
