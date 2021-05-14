package DesertShop;

public class Candy extends Desertitem {
	float quantity;
	public Candy(float q)
	{
		quantity=q;
	}

	@Override
	public float getcost() {
		float cost = quantity*3f*7;
		float taxamount=(5f/100f)*cost;
		float totalcost=cost+taxamount;
		return totalcost;
	}

}
