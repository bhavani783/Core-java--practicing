package day15;

import java.util.Scanner;

public class ReverseNumberusingAlgoritham {

	public static void main(String[] args) {
		//int num=12345;
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int rev=0;
		int org_num=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("reverse number is:"+rev);
		//checking palindrome or not
		if(org_num==rev) {
			System.out.println(org_num+"palindrome");
		}else {
			System.out.println(org_num+"not palindrome");
		}
	}

}
