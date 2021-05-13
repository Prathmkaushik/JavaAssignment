package Assignment1;
import java.util.*;
public class resultdecleration {
	public static void main(String[] args)
	{
		int English, Hindi, Maths;
		Scanner src = new Scanner(System.in);
		
		System.out.print("Enter English marks = ");
		English =src.nextInt();
		
		System.out.print("Enter Hindi marks = ");
		Hindi =src.nextInt();
		
		System.out.print("Enter Maths marks = ");
		Maths =src.nextInt();
		
		if(English>60 && Hindi>60 && Maths>60)
		{
			System.out.println("Pass");
		}
		else if((English>60 && Hindi>60 && Maths<60) || (English>60 && Hindi<60 && Maths>60) || (English<60 && Hindi>60 && Maths>60))
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
