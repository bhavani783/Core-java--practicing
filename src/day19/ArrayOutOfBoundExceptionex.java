package day19;

import java.util.Scanner;

public class ArrayOutOfBoundExceptionex {

	public static void main(String[] args) {
		System.out.println("program is started");
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		int a[]=new int[5];
		System.out.println("enter the position 0-4:");//if we provide out of bound we will get array out of bound exception
		int pos=sc.nextInt();
		System.out.println("enter a value");
		int value=sc.nextInt();
		a[pos]=value;
		System.out.println(a[pos]);
		System.out.println("program is completed");
		System.out.println("program is exited");
	}

}
