package day8;
/*Super at method level:
 * ---->when we inherit base class methods into derived class,there is a chance
 * that base class methods are similar to derived class methods and
 * jvm gets ambiguity.
 * --->In order to differentiate between base class and derived class methods ,
 * base class methods must be preceded with SUPER keyword.
 * 
 */
class Basetest1{
	int a=20;
	int b=30;
	public void display() {
		System.out.println(" i am from display method from base test");
	}
}
class Derivedtest1 extends Basetest1{
	int a=40;
	int b=50;
	public void display() {
		System.out.println(" i am from display method from derived test");
		super.display();
	}
}
public class Superatmethodlevel {

	public static void main(String[] args) {
		Derivedtest1 dt=new Derivedtest1();
		dt.display();

	}
}

