package day6;
//2)no.of parameters
public class Numberofparameters {
//data members
	int x=100;
	int y=200;
	
//default constructor
	public Numberofparameters () {
		System.out.println(" i am from default constructor");
		String name="default constructor";
	System.out.println(" name is:"+name);
	}
	public Numberofparameters(int a,int b) {
		
		System.out.println("i am from parameterized constructor with having 2 values");
		System.out.println("a value is:"+a+" "+"b value is:"+b);
		int sum=a+b;
	System.out.println(sum);
	}
	public Numberofparameters(int a,int b,int c) {
		
		System.out.println("i am from parameterized constructor with having 3 values");
		System.out.println("a value is:"+a+" "+"b value is:"+b+" "+"c value is:"+c);
		int sum1=a+b+c;
	System.out.println(sum1);
	}
	
	public static void main(String[] args) {
		Numberofparameters np=new Numberofparameters();
		Numberofparameters np1=new Numberofparameters(10,20);
		Numberofparameters np2=new Numberofparameters(30,40,50);
		System.out.println(np.x);
		System.out.println(np.y);
		System.out.println(np1.x);
		System.out.println(np1.y);
		System.out.println(np2.x);
		System.out.println(np2.y);

	}

}
