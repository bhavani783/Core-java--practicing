package day5;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("please enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
		System.out.println(num+"*"+i+"="+(num*i));
		}
	}

}
