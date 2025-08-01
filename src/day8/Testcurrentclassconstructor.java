package day8;
/*this() and this(--):
 * -->to establish the current class constructor communication,in java we have 2
 *implicit functions.
 *1)this():
 *-->It is used to call current class default constructor from the context of 
 *current class parameterized constructor.
 *-->this() must be first executable statement.
 *2)this(---):
 *--->It is used to call current class parameterized constructor from the context of
 *current class parameterized constructor. 
 *-->this(--)must be first executable statement. 
 */

public class Testcurrentclassconstructor {
	//data members
	String collage="sri venkateswara";
	String university="SVU";
	public Testcurrentclassconstructor() {
		System.out.println(" i am from default constructor");
	}
	public Testcurrentclassconstructor(String name) {
		//first executable statement must be this()
		this();// used to the call the current class default constructor
		System.out.println(" i am from parameterized constructor having 1 argument");
		System.out.println("name is:"+name);
	}
	public Testcurrentclassconstructor(int age,int ronum) {
		//this(--) must be first executable statement in the constructor
		this("david");//used to call current class parameterized constructor
		System.out.println(" i am from parameterized constructor having 2 arguments");
		System.out.println("age is:"+age+" "+"roll number is:"+ronum);
		
	}
	

	public static void main(String[] args) {
		Testcurrentclassconstructor t=new Testcurrentclassconstructor(23,20989);
		System.out.println("collage is:"+t.collage);
		System.out.println("university is:"+t.university);
	}

}
