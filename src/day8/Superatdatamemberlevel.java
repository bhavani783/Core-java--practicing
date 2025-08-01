package day8;
/*Super at data member level:
 * ---->when we inherit base class data members into derived class,there is a chance
 * that base class data members are similar to derived class data members and
 * jvm gets ambiguity.
 * --->In order to differentiate between base class and derived class data members ,
 * base class data members must be preceded with SUPER keyword.
 * 
 */
class Basetest{
	int a=20;
	int b=30;
	public void display() {
		System.out.println(" i am from display method from base test");
	}
}
class Derivedtest extends Basetest{
	int a=40;
	int b=50;
	public void print() {
		System.out.println(" i am from print metho from derived test");
		System.out.println(super.a);
		System.out.println(super.b);
	}
	
}
public class Superatdatamemberlevel {

	public static void main(String[] args) {
		Derivedtest dt=new Derivedtest();
		System.out.println(dt.a);
		System.out.println(dt.b);
		dt.print();
		dt.display();
		

	}

}
