package day12;

public class TestClass implements MyInterface{

	public static void main(String[] args) {
		
		//direct object creation
		TestClass t=new TestClass();
		t.show();
		MyInterface.display();//static method in interface must be accesses with interface name.
		System.out.println(MyInterface.x);//static data members must be accessed using interface name.
		System.out.println(MyInterface.y);//static data members must be accessed using interface name.
	}

}
