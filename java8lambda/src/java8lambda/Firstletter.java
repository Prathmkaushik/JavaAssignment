package java8lambda;

import java.util.*;
public class Firstletter {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		Arrays.asList("Rahul","Omkar","Manoj","Eqbal")
		.forEach(n->sb.append(n.charAt(0)));
		
		System.out.println(sb);
		
	}

}
