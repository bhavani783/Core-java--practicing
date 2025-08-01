package day17;

public class SingleDimentionalArrayex {
//Array is a collection of elements of similar data types.every location is represented by using index.
	public static void main(String[] args) {
		
		//Declare an array
		//approach1
		int a[]=new int[5];
		//add values into an array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		//approach 2
		//int a[]= {100,200,300,400,500};
		
		//find length of an array
		System.out.println("finding length of an array:"+a.length);	
		//read value from an array
		System.out.println(a[4]);
		//read all the values using classic for loop
		//for(int i=0;i<=a.length-1;i++) {//i<a.length
	//		System.out.println(a[i]);
	//	}
		
		//read all values using enhanced for loop
		for(int x:a) {
			System.out.println(x);
		}
	}

}
