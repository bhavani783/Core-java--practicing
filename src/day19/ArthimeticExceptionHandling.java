package day19;

import java.util.Scanner;

public class ArthimeticExceptionHandling {

	public static void main(String[] args) {
		System.out.println("program is started");
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		try {//try must followed by catch block
			System.out.println(100/num);
		}
		catch(ArithmeticException e){//we must provide exception name and data member
			System.out.println("invalid data please provide valid data/input");
		}
		System.out.println("program is completed");
		System.out.println("program is started");
	}

}
