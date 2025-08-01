package day10;

import java.util.Scanner;

//base class
 class Basetest1 {
int x,y;
public void operation(int x,int y) {
	this.x=x;
	this.y=y;
	int z=this.x+this.y;
	System.out.println("sum result is:"+z);
}
}
 //derived class 1
 class Derivedtest1 extends Basetest1 {
		int p,q;
		public void operation(int p,int q) {
			this.p=p;
			this.q=q;
			int r=this.p*this.q;
			System.out.println("multiplication result is:"+r);
		}
 }
 //derived class 2
 class Derivedtest2 extends Basetest1{
	 int d,e;
	 public void operation(int d,int e) {
		 this.d=d;
		 this.e=e;
		 int f=this.d%this.e;
		 System.out.println("divion result is:"+f);
	 }
 }
 //derived class 3
 class Derivedtest3 extends Basetest1{
	 int g,h;
	 public void operation(int g,int h) {
		 this.g=g;
		 this.h=h;
		 int i=this.g-this.h;
		 System.out.println("substraction result is:"+i);
	 }
 }
public class Methodoverridingex {

	public static void main(String[] args) {
	Basetest1 t;
	Scanner sc=new Scanner(System.in);
	System.out.println(sc);
	System.out.println("for sum please enter sum");
	System.out.println("for mul please enter mul");
	System.out.println("for division please enter div");
	System.out.println("for substraction please enter sub");
	
	String operationobj=sc.nextLine();
	System.out.println("please enter 2 values");
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	if(operationobj.equalsIgnoreCase("sum")) {
		t=new Basetest1();
		t.operation(a, b);
	}
	else if(operationobj.equalsIgnoreCase("mul")) {
		t=new Derivedtest1();
		t.operation(a, b);
	}
	else if(operationobj.equalsIgnoreCase("div")) {
		t=new Derivedtest2();
		t.operation(a, b);
	}
	else if(operationobj.equalsIgnoreCase("sub")) {
		t=new Derivedtest3();
		t.operation(a, b);
		
	}

}
}