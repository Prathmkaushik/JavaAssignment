package Assignment1;
import java.util.*;
public class factorial {
	public static void main(String[] args) {
		System.out.print("Enter the number for factorial = ");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
			int c=1;
		if(a==0)
		{
			System.out.println("the result is 1");
			
		}
		if(a>0)
		{
			for(int b=1; b<=a; b++)
			{
				c=c*b;
			}
		System.out.println("the result is "+c);
		}
		
	}

}
