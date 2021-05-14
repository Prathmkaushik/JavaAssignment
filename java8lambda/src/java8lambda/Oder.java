package java8lambda;

public class Oder {
	interface Order{
		void status();
	}
	public static void main(String[] args) {
		int ord = 10001;
		Order mOrder = () -> {
			if(ord >= 10000) {
				System.out.println("Accepted");
			}
			else {
				System.out.println("Rejected");
			}
		};
		mOrder.status();
	}
}
