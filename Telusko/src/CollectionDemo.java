import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * We have Collection interface and Collections class (collections are expandable and shrinkable
		 * ArrayList() class implements List() interface and it implements Collection interface
		 * We have ArrayList a class 
		 * we can use List() class it is mutable
		 * Generic is used to restrict the input type from object to passed in <>
		 * Map is a interface which work with (Key,Value) pair. Classes implements map are HashMap and HashTable one is synchronized and one is not
		 */
		System.out.println("// ArrayList is class which implements List() interface, without generic we can put object type of element in the list");
		Collection c = new ArrayList(); // ArrayList is class which implements List() interface, without generic we can put object type of element in the list
		c.add('c');
		c.add(5);
		c.add("Prateek");
		System.out.println(c);
		//we also can use Iterator interface to iterate the values present in Collection
		Iterator it= c.iterator();
		while(it.hasNext())// has next will check do we have next value in bucket
		{
			System.out.println(it.next()); // next will fetch the next value 
		}
		
		System.out.println("// in List we have advantage of Index num which help to fecth delete add any number from between");
		List <Integer> L= new ArrayList<>(); // in List we have advantage of Index num which help to fecth delete add any number from between
		L.add(5); // in List we can have duplicate values
		L.add(1);
		L.add(20);
		System.out.println(L);
		L.add(0,9); // put a element between the existing values (it will automatically move the existing value to next index)
		System.out.println(L);
		// as we have index in List we can use for loop or enhanced for loop to print the values
		for(int i=0; i< L.size(); i++ )
		{
			System.out.println(L.get(i));
		}
		
		Collections.sort(L); // collections class have a static method sort which will sort the elements present in List
		Collections.reverse(L); // we can reverse the elements also
 		for (Object o: L) // also can use specific type for(Integer o: L)
		{
			System.out.println("Printing by Enhanced for loop : "+o);
		}
		
		
		Set M = new HashSet(); // advantage of using map is it will not allow duplicate values
		M.add(M); // also it will sort values if we use TreeSet() instead of HashSet();
		M.add(5);
		System.out.println(M); 
		
		Set<Integer> T= new TreeSet<>(); // it will automatically sort the elements? Generic is used to restrict the input type from object to passed in <>
		T.add(5);
		T.add(2);
		T.add(8);
		System.out.println(T);
		
		/*
		 * Map work on key value pair concept in this we have unique keys and value for that key
		 * key can't be dupilicate it means we use set behind the map
		 * Map <K,V) m = new HashMap(); 
		 * Map <k,v> m = new hashtable();
		 * 2 classes which implements map. Hashtable is synchronized HashMap is not synchnorized
		 * when we fetch values they will not come in puting order because hash is concept which allocate memory as per
		 * availability in heap memory
		 * 
		 */
		Map<String, String> m = new HashMap<>();
		m.put("Name", "Prateek");
		m.put("Num", "8221021777");
		m.put("Address", "Sohna");
		
		System.out.println("MAP output" + m); // this will not print value in puting order
		//We can use loop as well
		Set<String> s= m.keySet(); // keyset will fetch all keys
		for(String Key: s)
		{
			System.out.println(Key+" "+m.get(Key));
		}
		
	}

}
