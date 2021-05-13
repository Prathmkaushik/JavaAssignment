package Assignment1;

public class ArmstrongNum {
	public static void main(String[] args) 
	{
		int c = 0,a,temp;
		int n = 153;
		temp = n;
		while(n>0)
		{
			a=n%10;
			c=c+(a*a*a);
			n=n/10;
		}
		if(temp==c)
		{
			System.out.println("this is Armstrong number ");
		}
		else
		{
			System.out.println("This is not Armstrong number");
		}
	}

}
