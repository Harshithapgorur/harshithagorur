 1. Collection is a interface used to stroed the group of elements.collection interface extend by Itrable
This interface contains all the basic methods which every collection has like adding the data
 into the collection, removing the data, clearing the data, etc. 
 Collection has different type Set,List,Queue,SortedSet this are interface and extend by the collection
 and the sub type is ArrayList,linkedlist,SortedSet and SortedMap and this are classes.
 2. The map interface is present in java.util package represents a mapping between a key and a 
 value. The Map interface is not a subtype of the Collection interface. 
 Map ref = new HashMap(); 
// Obj is the type of the object to be stored in Map
3. HashMap :-It does not provide a guarantee to sort the data.
In HashSet, only an element can be null.
it uses hashCode() or equals() method for comparison.
TreeSet:-It provides a guarantee to sort the data. The sorting depends on the supplied Comparator.
It does not allow the null element.
4.Fail-Fast systems abort operation as-fast-as-possible exposing failures 
immediately and stopping the whole operation. Whereas.
 Fail-Safe:- systems 
don't abort an operation in the case of a failure.
 Such systems try to avoid raising failures as much as possible.
 5.Is simple API returns an instance of IntStream from the 
 input String. Simply put, IntStream contains an integer 
 representation of the characters from the String object:
 String testString = "String"; IntStream intStream = testString. chars();
 6.Spliterator API:-Spliterators, like other Iterators, are for
 traversing the elements of a source. A source can be a Collection, 
  an IO channel or a generator function. It is included in JDK 8 for support of 
 efficient parallel traversal(parallel programming) in addition to sequential traversal.
 9.Core  is the core of the framework that power
 features such as Inversion of Control and dependency injection. Beans 
 provides Beanfactory, which is a sophisticated implementation of the factory pattern.
10. Spring IOC resolves such dependencies with Dependency 
 Injection, which makes the code easier to test and reuse.
 Loose coupling between classes can be possible by defining interfaces for common
 functionality and the injector will instantiate the objects of required implementation.
 

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Country {
	public static void main(String[] args) {
		Map<String, Integer> map=new TreeMap<String, Integer>();
		map.put("India", 91);
		map.put("UK", 32);
		map.put("USA", 13);
		map.put("UAE", 42);
		map.put("China", 52);
		
		Set<Entry<String, Integer>> entry= map.entrySet();
		entry.forEach(ele->System.out.println(ele));
		
		map.forEach((key,value)->{if(value==52) {System.out.println(key);}});
			
		Iterator<Entry<String, Integer>> itr=entry.iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> ent= itr.next();
			if(ent.getValue()==42) {
				itr.remove();
				for (Entry<String, Integer> entry2 : entry) {
					System.out.println(entry2);
				}
			}
		}
		
		
	}
}


public class LinkList {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(123);
		list.add(23);
		list.add(2354);

		list.forEach(ele -> System.out.println(ele));
		list.removeFirst();
		System.out.println("removed first");
		list.forEach(ele -> System.out.println(ele));
		list.removeLast();

		System.out.println("removed last");
		list.forEach(ele -> System.out.println(ele));

	}
}