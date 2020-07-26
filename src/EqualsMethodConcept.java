
public class EqualsMethodConcept {
	
	int i;double j;
	EqualsMethodConcept(int i,double j)
	{
		this.i=i;
		this.j=j;
	}
	
	public boolean equals(Object obj)
	{ 
		EqualsMethodConcept e =(EqualsMethodConcept)obj;
		if(this.i==e.i && this.j==e.j)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
		EqualsMethodConcept rv=new EqualsMethodConcept(80,80.5);
		EqualsMethodConcept rv1=new EqualsMethodConcept(80,90.5);
		System.out.println(rv.equals(rv1));

	}

}
