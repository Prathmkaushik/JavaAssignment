import java.util.*;
public class HashSetOrderUnorder {
    public static void main(String[] args){
        HashSet<String> h1=new HashSet<>();
        h1.add("Mango");
        h1.add("Apple");
        h1.add("Grapes");
        h1.add("Banana");
        h1.add("Kiwi");
        System.out.println("HashSet is Unordered");
        Iterator<String> i=h1.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println("                   ");
        LinkedHashSet<String> h2=new LinkedHashSet<>();
        h2.add("Apple");
        h2.add("Banana");
        h2.add("Grapes");
        h2.add("Kiwi");
        h2.add("Mango");
        System.out.println("LinkedHashSet is Ordered");
        Iterator<String> i1=h2.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
        }
    }
}



