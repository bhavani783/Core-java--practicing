package day12;

public class ClassI1 implements InterfaceI1 {
	//abstract implementation(public is must otherwise we will get compile time error)
	public void show() {
		System.out.println("\nthis is implementation for abstract method in Class");
	}
	public static void main(String[] args) {
		//direct object creation
		ClassI1 c1=new ClassI1();
		c1.print();
		c1.show();
		InterfaceI1.display();
		System.out.println("x value is"+InterfaceI1.x);
		System.out.println("y value is:"+InterfaceI1.y);
		

	}

}
