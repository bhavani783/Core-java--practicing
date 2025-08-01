package day19;

import java.util.Scanner;

public class ExceptionDemo {
//Arithmetic exception example
	public static void main(String[] args) {
		System.out.println("program is started");
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter a number");//if we provide invalid input then we will get arithmetic exception
		int num=sc.nextInt();
		System.out.println(100/num);
		System.out.println("program is compiled");
		System.out.println("program is exicuted");
		

	}

}
