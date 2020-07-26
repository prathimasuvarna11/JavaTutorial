import java.util.Scanner;

public class Demo5 {
	 
public int armstrongNumber(int num)
{
	int r;
	int sum=0;
	int temp;
	temp=num;
	while(num>0)
	{
		r=num%10;
		sum=sum+(r*r*r);
		num=num/10;
	}
	if(temp==sum)
	{
		System.out.println(temp+" is an armstrong number");
	}
	else
	{
		System.out.println(temp+" is not an armstrong number");
	}
	return sum;
	
}

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		Demo5 d=new Demo5();
		int number=d.armstrongNumber(n);
		System.out.println("Sum is:"+number);
       
	}

}
