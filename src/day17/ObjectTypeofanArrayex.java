package day17;

public class ObjectTypeofanArrayex {
//If you want to store heterogeneous data type of elements in array you can use object type of an array.
	//it is not recommended,instead we use Arraylist
	public static void main(String[] args) {
		Object a[]= {100,10.5,'B',"Welcome",true};
		
		//read values
		for(Object x:a) {
			System.out.println(x);
		}

	}

}
