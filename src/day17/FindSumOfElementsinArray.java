package day17;

public class FindSumOfElementsinArray {

	public static void main(String[] args) {
		int a[]= {100,200,300,400,500};
		int sum=0;
		for(int i=0;i<=4;i++) {
			sum=sum+a[i];
		}
		System.out.println("length of an array:"+a.length);
		System.out.println("sum of elements in an array:"+sum);
	}

}
