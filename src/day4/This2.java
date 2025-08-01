package day4;

public class This2 {
	//data members
int a;
int b;
int c;
//parameterized constructor
public This2(int a,int b,int c) {
	this.a=a;
	this.b=b;
	this.c=c;
	System.out.println("------formal paremeters-----");
	System.out.println("a valus is:"+a);
	System.out.println("b valus is:"+b);
	System.out.println("c valus is:"+c);
	System.out.println("------Actual data members-----");
	System.out.println("a valus is:"+this.a);
	System.out.println("b valus is:"+this.b);
	System.out.println("c valus is:"+this.c);
	this.a=this.a+20;
	this.b=this.b+40;
	this.c=this.c+60;
	
	System.out.println("------Actual data members after changing values-----");
	System.out.println("a valus is:"+this.a);
	System.out.println("b valus is:"+this.b);
	System.out.println("c valus is:"+this.c);
	
	a=a+2;
	b=b+4;
	c=c+6;
	System.out.println("------formal paremeters after changing values-----");
	System.out.println("a valus is:"+a);
	System.out.println("b valus is:"+b);
	System.out.println("c valus is:"+c);
	
	
}
	public static void main(String[] args) {
		This2 t=new This2(10,20,30);
		System.out.println("------i am from main method------");
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.c);

	}

}
