package day10;

import java.util.Scanner;

public class Derivedtest extends Basetest {
	int p,q;
	public void operation(int p,int q) {
		this.p=p;
		this.q=q;
		int r=this.p*this.q;
		System.out.println("multiplication is:"+r);
	}
	public static void main(String[] args) {
		Basetest t;
		Scanner s=new Scanner(System.in);
		System.out.println(s);
		System.out.println("for sum please enter sum");
		System.out.println("for multiplication please enter mul");
		
		String operationobj=s.nextLine();
		System.out.println("please enter 2 int values");
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(operationobj.equalsIgnoreCase("sum")) {
			t=new Basetest();
			t.operation(a,b);
		}
		else if(operationobj.equalsIgnoreCase("mul")) {
			t=new Derivedtest();
			t.operation(a, b);
		}

	}

}
