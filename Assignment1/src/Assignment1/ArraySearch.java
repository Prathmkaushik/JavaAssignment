package Assignment1;
import java.util.*;
public class ArraySearch {
	public static void main(String[] args)
	{
		int n, x, i=0, flag=0;
		Scanner src =new Scanner(System.in);
		System.out.print("Enter no. of array = ");
		n= src.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all elements of array ");
		for(i=0; i<n; i++)
		{
			a[i]= src.nextInt();
		}
		System.out.print("Enter element your want to search = ");
		x= src.nextInt();
		for(i=0; i<n; i++)
		{
			if(a[i] == x)
			{
				flag =1;
				break;
			}
			else
			{
				flag =0;
			}
		}
		if(flag == 1)
		{
			System.out.println("Element found ");
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}
