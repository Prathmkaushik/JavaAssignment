
public class main extends Banks{

	public static void main(String[] args)
	{
		SavingAcc s = new SavingAcc(2,2,4000);
		float savings = s.amount();
		CurrentAcc ca = new CurrentAcc(2000,1000);
		float current = ca.amount();
		float total = savings + current ;
		System.out.println("Total cash amount "+total);
	}

}
