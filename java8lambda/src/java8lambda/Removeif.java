package java8lambda;

import java.util.ArrayList;
public class Removeif {
	public static void main(String[] args) {
		
		
		ArrayList<String>n=new ArrayList<String>();
		
		n.add("Rahul");
		n.add("Ram");
		n.add("Priya");
		n.add("Nikita");
		n.add("Suresh");
		n.add("Karan");
		
		System.out.println(n);
		
		n.removeIf(t->(t.length()%2==1));
		System.out.println(n);

}
}	
