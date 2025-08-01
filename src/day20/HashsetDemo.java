package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {
/*HASHSET:
 * -->it is a class implemented by set interface
 * 1)heterogeneous data allowed
 * 2)Insertion order_not preserved(follow hashing)
 * 3)duplicate elements not allowed
 * 4)multiple nulls not allowed
 * 5)only single null is allowed
 */
	public static void main(String[] args) {
		//declaration
		Set myset=new HashSet();
		
		//add elements
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(true);
		myset.add(null);
		myset.add('c');
		
		//print hashset
		System.out.println(myset);
		
		//size of an hashset
		System.out.println(myset.size());
		
		//remove specific element
		myset.remove(4);
		System.out.println("after removing"+myset);
		
		//convert hashset into arraylist
		ArrayList a=new ArrayList(myset);
		System.out.println("\nAfter converting hashset into arraylist"+a);
		
		//read elements
		for(Object o:myset) {
			System.out.println(o);
		}
		
		
	}

}
