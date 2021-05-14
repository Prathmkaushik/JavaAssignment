package java8lambda;
import java.util.*;

public class uppercase {
	public static void main(String[] args) {
		ArrayList<String> n = new ArrayList<>();

		n.add("Aryan");
		n.add("Kadambdi");
		n.add("Kundan");
		n.add("Purav");
		n.add("Harsh");
		n.add("Mohit");
		n.replaceAll(t -> t.toUpperCase());

		System.out.println(n);

	}

}
