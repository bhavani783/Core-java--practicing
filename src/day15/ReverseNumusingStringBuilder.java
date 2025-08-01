package day15;

import java.util.Scanner;

public class ReverseNumusingStringBuilder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(s);
		System.out.println("Enter a number");
		int num=s.nextInt();
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		StringBuilder rev=sb.reverse();
		System.out.println("Reverse number is:"+rev);

	}

}
