package day3;

import java.util.Scanner;

public class Foloop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter number");
		int num=sc.nextInt();
		System.out.println(sc);
		System.out.println("entered number is:"+num);
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}

}
