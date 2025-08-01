package day17;

public class TwoDimensionalArrayex {

	public static void main(String[] args) {
		//Declaring an array
		/*approach 1
		int a[][]=new int[3][2];
		
		
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;*/
		
		//approach2
		int a[][]= {{100,200},{300,400},{500,600}};
		System.out.println("length of rows:"+a.length);
		System.out.println("length of colmns:"+a[0].length);
		
		//read single value from an array
		System.out.println(a[1][1]);
		
		//read all values 
		for(int arr[]:a) {
			for(int x:arr) {
				System.out.println(x);
			}
		}
		
				
	}

}
