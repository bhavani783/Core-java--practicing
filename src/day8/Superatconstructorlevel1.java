package day8;
/*
2)super(---)---
* --->It is used to call base class parameterized constructor from the context of
* derived class default and parameterized constructors.
*/

class basetest1{
	//data member
	String name="super(---)differences";
	//default constructor
	public basetest1() {
		System.out.println(" i am from base test default constructor");
	}
	//parameterized constructor
	public basetest1(int age) {
		System.out.println("i am from base test parameterized constructor");
		System.out.println("age is:"+age);
	}
}
class derivedtest1 extends basetest1{
	//default constructor
	public derivedtest1() {
		//super(---)must be first executable statement
		super(34);//3)calling base class parameterized constructor from derived class default constructor(mandatory)
		System.out.println("calling base class parameterized constructor from derived class default constructor");
		System.out.println(" i am from derived test default constructor");
	}
	//parameterized constructor
	public derivedtest1(int number) {
		//super(--) must be first executable statement
		super(34);//4)calling base class parameterized constructor from derived class parameterized constructor(mandatory)
		System.out.println("calling base class paremeterized constructor from derived test parameterized constructor");
		System.out.println("i am from derived test parameterized constructor");
	}
}
public class Superatconstructorlevel1 {

	public static void main(String []args) {
		
		derivedtest1 d=new derivedtest1();
		System.out.println(d.name);
		derivedtest1 d1=new derivedtest1(1234);
		System.out.println(d1.name);

	}

}
