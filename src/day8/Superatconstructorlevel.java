package day8;
/*Super at constructor level:
 * 1)super()--
 * --->It is used to call base class Default constructor from the context of 
 * derived class default and parameterized constructors.
 * 2)super(---)---
 * --->It is used to call base class parameterized constructor from the context of
 * derived class default and parameterized constructors.
 */

class basetest{
	//data members
	String name="super()differences";
	//default constructor
	public basetest() {
		System.out.println(" i am from base test default constructor");
	}
	//parameterized constructor
	public basetest(int age) {
		System.out.println("i am from base test parameterized constructor");
		System.out.println("age is:"+age);
	}
}
class derivedtest extends basetest{
	//default constructor
	public derivedtest() {
		//super()must be first executable statement
		super();//1)calling base class default constructor from derived class default constructor(optional)
		System.out.println(" i am from derived test default constructor");
	}
	//parameterized constructor
	public derivedtest(int number) {
		//super() must be first executable statement
		super();//2)calling base class default constructor from derived class parameterized constructor(optional)
		System.out.println("i am from derived test parameterized constructor");
	}
}
public class Superatconstructorlevel {
	public static void main(String[] args) {
	derivedtest dt=new derivedtest();//output as base test default and derived test default constructors.
	System.out.println(dt.name);
	derivedtest dt1=new derivedtest(1234);//we will get output as base test default constructor and derived test parameterized constructor.
	System.out.println(dt1.name);
	}

}
