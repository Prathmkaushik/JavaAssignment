package Assignment1;
import java.util.*;
public class incomTax {
	public static void main(String[] args)
	{
		double a,b;
		Scanner src=new Scanner(System.in);
		System.out.print("Enter your CTC = ");
		a= src.nextDouble();
		if(a<180000)
		{
			b=a/10;
			System.out.println("Your tax amount = "+b);
		}
		else if(a<300000 && a>180001)
		{
			b=a/10;
			System.out.println("Your tax amount = "+b);
		}
		else if(a<500000 && a>300001)
		{
			b=a/20;
			System.out.println("Your tax amount = "+b);
		}
		else if(a<1000000 && a>500001)
		{
			b=a/30;
			System.out.println("Your tax amount = "+b);
		}
		
	}

}
