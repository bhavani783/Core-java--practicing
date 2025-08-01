package day20;

import java.util.ArrayList;
/*ARRAYLIST:
 * -->It is a class,implemented by list interface.
 * rules:
 * 1)Heterogeneous data allowed
 * 2)Insertion Order-preserved(follow indexing)
 * 3)Duplicate elements allowed
 * 4)Multiple nulls allowed
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		//Declaration
		ArrayList mylist=new ArrayList();//it will store heterogeneous data types
		
		//adding data into arraylist
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add('c');
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		
		//printing arraylist
		System.out.println("printing data from arraylist"+mylist);
		
		//remove specific element
		mylist.remove(4);//4 is index number
		System.out.println("\nafter removing 5th index"+mylist);
		 
		//add value or insert value
		mylist.add(4, "java");//in 4th index we can add java
		System.out.println("\nAfter insertion"+mylist);
		
		//access specific element
		System.out.println(mylist.get(5));
		
		//reading all elements in arraylist
		System.out.println("\ngetting all data");
		for(Object x:mylist) {
			System.out.println(x);
		}
		

	}

}
