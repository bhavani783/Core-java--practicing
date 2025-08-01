package day7;
/*MULTI LEVEL INHERITANCE
 * -->there exist 1 base class and 1 derived class and multiple intermediate base classes.
 */
class A{
	//data members
	int a=100;
	int a1=200;
	//method
	public void display() {
		System.out.println(" i am from class A");
		System.out.println(a);
		System.out.println(a1);
		System.out.println("addition of a and a1 is:"+(a+a1));
	}
}
class B extends A{
	//data members
	int b=300;
	int b1=400;
	//method
	public void show() {
		System.out.println(" i am from class B");
		System.out.println(b);
		System.out.println(b1);
		System.out.println("addition of b and b1 is:"+(b+b1));
	}
}
class C extends B{
	//data members
	int c=200;
	int c1=400;
	//method
	public void print() {
		System.out.println(" i am from class C");
		System.out.println(c);
		System.out.println(c1);
		System.out.println("addition of c and c1 is:"+(c+c1));
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		//if we create object for derived class we can get all features from all classes.
		C cobj=new C();
		System.out.println(cobj.a);
		System.out.println(cobj.a1);
		System.out.println(cobj.b);
		System.out.println(cobj.b1);
		System.out.println(cobj.c);
		System.out.println(cobj.c1);
		cobj.display();
		cobj.show();
		cobj.print();
		//if we can create object for B ,we can access only class A and B features.
		B bobj=new B();
		System.out.println(bobj.a);
		System.out.println(bobj.a1);
		System.out.println(bobj.b);
		System.out.println(bobj.b1);
		bobj.display();
		bobj.show();
		//if we can create object for parent class ,we can access only those features
		A aobj=new A();
		System.out.println(aobj.a);
		
		System.out.println(aobj.a1);
		aobj.display();

	}

}
