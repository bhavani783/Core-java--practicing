package day15;

import java.util.Scanner;

public class ReversenumUsingStringbuffer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter number");
		int number=sc.nextInt();
		StringBuffer sb=new StringBuffer(String.valueOf(number));
		StringBuffer rev=sb.reverse();
		System.out.println("reverse number is:"+rev);

	}

}
