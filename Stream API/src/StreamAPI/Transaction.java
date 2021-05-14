package StreamAPI;

public class Transaction {
	Trader trader;
	int year;
	int value;
	public Transaction(Trader trader, int year, int value) {
		
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTransaction() {
		return trader;
	}
	public void setTransaction(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [Trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
	
	

}
