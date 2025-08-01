package day5;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(sc);
	System.out.println("please enter a value to print square of that number");
	int num=sc.nextInt();
	int result=num*num;
	System.out.println("square of that number is:"+result);

	}

}
