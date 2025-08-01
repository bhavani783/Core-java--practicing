package day16;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	//int num=121;
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		int rev=0;
		int org_num=num;
		while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
		}
		System.out.println("Reverse number is:"+rev);
		if(org_num==rev) {
		System.out.println(org_num+"\npalindrome");
		}else {
		System.out.println(org_num+"\nnot palindrome");
	}

	}

}
