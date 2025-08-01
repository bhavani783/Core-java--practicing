package day12;

public class I4ImplementationClass implements I4{
	//we must specify public infront of every abstract implementation method,otherwise we get compile time error
	//Abstract method implementation on class
	public void f1() {
		System.out.println("\nI am f1 implemented method");
	}
	public void f2() {
		System.out.println("\nI am f2 implemented method");
	}
	public void f3() {
		System.out.println("\nI am f3 implemented method");
	}
	public void f4() {
		System.out.println("\nI am f4 implemented method\n");
	}
	//class own method
	public void display() {
		int a=10;
		int b=20;
		System.out.println("I am from display method");
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);
	}

	static public void main(String[] args) {//public static void main(String [] args)
		//direct object creation
		I4ImplementationClass im=new I4ImplementationClass();
		im.f1();
		im.f2();
		im.f3();
		im.f4();
		im.display();
		//indirect object creation for I1
		I1 i1=new I4ImplementationClass();
		i1.f1();//we can access only I1 features
		//indirect object creation for I2
		I2 i2=new I4ImplementationClass();
		i2.f1();
		i2.f2();//we can both I1 and I2, because I2 extends I1
		//indirect object creation for I3
		I3 i3=new I4ImplementationClass();
		i3.f1();
		i3.f2();
		i3.f3();//I3 extends I2(I2 contains both I1 and I2 features)
		//indirect object creation for I4
		I4 i4=new I4ImplementationClass();
		i4.f1();
		i4.f2();
		i4.f3();
		i4.f4();
		
	}
	

}
