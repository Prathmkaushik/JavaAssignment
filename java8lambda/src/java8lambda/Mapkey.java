package java8lambda;

import java.util.HashMap;
import java.util.*;
public class Mapkey {
public static void main(String[] args) {
		
		HashMap<String,String> m=new HashMap<>();
		StringBuilder p=new StringBuilder();
		
		 m.put("Aryan", "Pratham");
		 m.put("Varun", "John");
		 m.put("Salim", "Javed");
		 
		 
		 
		 Set s1=m.entrySet();
		 System.out.println(s1);
		 
         Iterator n=s1.iterator();
         while(n.hasNext())
         {
        	 Map.Entry m1 =(Map.Entry)n.next();
             String x=(String) m1.getKey()+m1.getValue();
        	 p.append(x);

         }
         
         System.out.println(p);
	}



}
