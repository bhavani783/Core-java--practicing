package day12;

public interface InterfaceI1 {
	//public static final by default
	int x=200;
	int y=400;
	//abstract method(public abstract by default)
	void show();
	
	//default method
	default void print() {
		System.out.println("this is default method from interface");
		System.out.println("x value is:"+x);
		System.out.println("y value is:"+y);
	}
	//static method
	static void display() {
		System.out.println("\nthis is static method from interface");
		System.out.println(" if u want to access static methods use interface name ,not the object referrence.");
	}
}
