package day5;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("please enter a number to check eligible for vote or not");
		int number=sc.nextInt();
		System.out.println("entered number is:"+number);
		/*if(number<=17) {
			System.out.println("not eligible for voting");
		}else if(number>=18) {
			System.out.println("eligible for vote");
		}else {
			System.out.println("invalid input");
		}*/
	if(number>=18) {
		System.out.println("eligible for voting");
	}else {
	System.out.println("not eligible for voting");
	}

	}

}
