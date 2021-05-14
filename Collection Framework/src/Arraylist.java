import java.util.*;
public class Arraylist {
	public static void main(String[] args) 
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
			ar.add(7);
			ar.add(4);
			ar.add(3);
			ar.add(5);
			ar.add(2);
			ar.add(8);
			ar.add(9);
			ar.add(1);
			ar.add(6);
			Collections.sort(ar);
			System.out.println(ar);
			Collections.sort(ar, Collections.reverseOrder());
		ListIterator lr = ar.listIterator();
		while(lr.hasNext())
		{

			System.out.println(lr.next());
		}
	}

}
