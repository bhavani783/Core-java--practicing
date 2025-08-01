package day16;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("Number is even\n"+num);
		}
		else {
			System.out.println("Number is Odd\n"+num);
		}
	}

}
