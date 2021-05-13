
public class SavingAcc extends Banks {
	float interestrate; 
	float year;
	float initialamount;
	public SavingAcc(float i, float y, float r) 
	{
		interestrate = i;
		year = y;
		initialamount = r; 
		
	}
	public float amount()
	{
		float FD = interestrate*year*initialamount;
		return FD;
	}

}
