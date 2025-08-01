package day12;

public interface MyInterface {
	int x=100;//jvm will append 'public static final' by default
	int y=200;//jvm will append 'public static final' by default
	
//default method
	default void show() {
		System.out.println("i am show from default method");
	}
	//static method
	static void display() {
		System.out.println("i am display from static method");
	}
	
}
