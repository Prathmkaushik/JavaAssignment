package Assignment1;
import java.util.*;
public class CUIApp {
	public static void main(String[] args)
	{
		String username, password;
		int totalattempts =3;
		while(totalattempts != 0)
		{
			Scanner src = new Scanner(System.in);
			System.out.print("Enter Username : ");
			username = src.nextLine();
			System.out.print("Enter Pasword : ");
			password = src.nextLine();
			if(username.equals("PRATKAUS") && password.equals("prthm"))
			{
				System.out.println("Welcome "+username);
			}
			else
			{
				System.out.println("Try Again");
				totalattempts--;
				System.out.println(totalattempts);
			}
		}
		if(totalattempts == 0)
		{
			System.out.println("Contact to admin");
		}
		
	}
}
