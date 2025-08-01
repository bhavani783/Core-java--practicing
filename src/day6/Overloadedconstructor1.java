package day6;
/*Constructor overloading:
 * --->If a constructor said to be overloaded then that class must be having
 * more than 1 constructor with same name and with different signature.
 * Signature represents---
 * 1)Type of parameters
 * 2)No.of parameters
 * 3)Order of parameters
 */
//1)Type of parameters example program
public class Overloadedconstructor1 {
//data members
	int x;
	int y;
	//default constructor
	public Overloadedconstructor1 () {
		x=20;
		y=30;
		System.out.println(" i am from default constructor");
		System.out.println("x value is:"+x);
		System.out.println("y value is:"+y);
	}
	//parameterized constructor
	public Overloadedconstructor1 (String name) {
		System.out.println(" i am from parameterized constructor");
		System.out.println("Name is:"+name);
	}
	//object as parameterized constructor
	public Overloadedconstructor1(Overloadedconstructor1 ovl) {
		x=ovl.x;
		y=ovl.y;
		System.out.println("i am from object as parameterized constructor");
		System.out.println("x value is:"+x);
		System.out.println("y value is:"+y);
	}
	public static void main(String[] args) {
		Overloadedconstructor1 ovc1=new Overloadedconstructor1 ("java");
		System.out.println(ovc1.x);
		System.out.println(ovc1.y);
		Overloadedconstructor1  ovc2=new Overloadedconstructor1();
		Overloadedconstructor1 ovc3=new Overloadedconstructor1(ovc2); 
		System.out.println("i am from main and checking whether data copied from ovc2 or not");
		System.out.println(ovc3.x);
		System.out.println(ovc3.y);

	}

}
