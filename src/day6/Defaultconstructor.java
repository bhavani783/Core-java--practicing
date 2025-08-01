package day6;
/*Default constructor
 * --->Main purpose is to replace default values with same values each and every
 *time when we create object for the class. 
 *--->Never takes any parameters.
 *--->values doesn't change. 
 */
public class Defaultconstructor {
int a;
int b;
public Defaultconstructor() {
	a=10;
	b=20;
	System.out.println("a value is:"+a);
	System.out.println("b value is:"+b);
}
	public static void main(String[] args) {
		Defaultconstructor dc=new Defaultconstructor();
		Defaultconstructor dc1=new Defaultconstructor();
		Defaultconstructor  dc2=new Defaultconstructor();
		System.out.println(dc.a);
		System.out.println(dc.b);
		System.out.println(dc1.a);
		System.out.println(dc1.b);
		System.out.println(dc2.a);
		System.out.println(dc2.b);

	}

}
