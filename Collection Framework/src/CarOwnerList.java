
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class CarOwnerList {
	static Set<CarOwnerDetails> car=new TreeSet<CarOwnerDetails>(new ParkOrder());
	static CarOwnerDetails p1 = new CarOwnerDetails("Tushar","Swift",4298,1111111111,"Delhi");
	static CarOwnerDetails p2 = new CarOwnerDetails("Kartik","Baleno",7686,22222222,"Ghaziabad");
	static CarOwnerDetails p3 = new CarOwnerDetails("Mukul","Ciaz",9832,333333333,"Punjab");
	static int add_new_car(CarOwnerDetails obj) {
	car.add(obj);

	if(obj.ownerName.equalsIgnoreCase("Tushar")) {
	System.out.println("Token no for Tushar: 1");
	}
	if(obj.ownerName.equalsIgnoreCase("Kartik")) {
	System.out.println("Token no for Kartik: 2");
	}
	if(obj.ownerName.equalsIgnoreCase("Mukul")) {
	System.out.println("Token no Mukul: 3");

	}
	return 0;

	}
	static void remove_car(String name) {
	for(CarOwnerDetails p:car) {
	if(name.equalsIgnoreCase(p.ownerName))
	car.remove(p);
	}
	for(CarOwnerDetails p:car) {
	System.out.println("Owner names of cars parked:"+ p.ownerName);}
	}
	static void get_parked_car_location(int token) {
	if(token==1) {
	System.out.println("Car Location : Floor 3, Section 4, Slot 32");
	}
	if(token==2) {
	System.out.println("Car Location : Floor 1, Section 8, Slot 10");
	}
	if(token==3) {
	System.out.println("Car Location : Floor 2, Section 3, Slot 20");
	}

	}
	public  static void main(String[] args) {
	add_new_car(p1);
	add_new_car(p2);
	add_new_car(p3);
	Scanner s= new Scanner(System.in);
	System.out.println("Enter your name");
	String n=s.nextLine();
	remove_car(n);
	System.out.println("Enter your token no.");
	int t=s.nextInt();
	get_parked_car_location(t);




	}

}
