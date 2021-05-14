package DesertShop;

public class IceCream extends Desertitem {
	float quantity;
	public IceCream(float q)
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
