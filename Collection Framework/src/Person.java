import java.util.*;
public class Person implements Comparable<Person> {
	int weight;
	double height;
	String name;
	
	public Person(int weight, double height, String name) {
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	int getWeight() {
		return weight;
	}
	double getHeight() {
		return height;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name= name;
	}
	public int compareTo(Person person) {
		return this.getWeight() - person.getWeight();
		
	}
	public String toString() {
		return "Person{" + "weight " +weight+ ", height "+height+ ", name "+name+ "}" ;
	}
	

//public class TreeSetUserDefinedObject {
	public static void main(String[] args) {
		TreeSet<Person> person = new TreeSet<>();
		
		person.add(new Person(60, 5.8, "Rahul"));
		person.add(new Person(75, 5.10, "Tiwari"));
		person.add(new Person(60, 5.5, "Mishra"));
		person.add(new Person(80, 6.1, "Kaushik"));
		
		System.out.println("Person soted on the basis of their weight :");
		System.out.println(person);

	}
	
}
