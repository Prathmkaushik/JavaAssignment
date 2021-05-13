
public class CurrentAcc extends Banks {
	float cash;
	float credit;
	public CurrentAcc(float c, float cr) 
	{
		cash = c;
		credit = cr;
	}
	public float amount()
	{
		float cashcredit = cash + credit;
		return cashcredit;
	}

}
