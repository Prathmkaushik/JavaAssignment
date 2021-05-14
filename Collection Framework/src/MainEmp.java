
import java.util.Hashtable;
import java.util.Map;

public class MainEmp {
	 public static void main(String[] args) {
	        Employee e1=new Employee(003,"Pratham");
	        Employee e2=new Employee(006,"Aryan");
	        Dept d1=new Dept(15,"Computer Science");
	        Map<Employee,Dept> m1=new Hashtable<>();
	        m1.put(e1,d1);
	        m1.put(e2,d1);
	        System.out.println(" The Hashcode of e1 is:" +e1.hashCode());
	        System.out.println(" The Hashcode of e2 is:" +e2.hashCode());
	        for(Map.Entry<Employee,Dept>entry: m1.entrySet()){
	            System.out.println(entry.getKey());
	            System.out.println(entry.getValue());
	        }
	    }


}
