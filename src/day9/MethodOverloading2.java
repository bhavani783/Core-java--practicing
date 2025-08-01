package day9;
//NUMBER OF PARAMETERS

public class MethodOverloading2 {
	//method 1
	public void Displaydetails() {
		System.out.println("----Overloading without values-----");
	}
	public void Displaydetails(int a) {
		System.out.println("\n-----Overloading with 1 value-----");
		System.out.println("a value is:"+a);
	}
	//method 3
	public void Displaydetails(int a,int b) {
		int c=a+b;
		System.out.println("\n---- Overloading with 2 values-----");
		System.out.println("a value is:"+a+" "+"b value is:"+b);
		System.out.println("addition of 2 values is:"+c);
	}
	//method 4
	public void Displaydetails(int a,int b,int c) {
	int	d=a+b+c;
	System.out.println("\n----Overloading with 3 values-----");
	System.out.println("a value is:"+a+" "+"b value is:"+b+" "+"c value is:"+c);
	System.out.println("addition of 3 values is:"+d);
		
	}	
	public static void main(String[] args) {
		MethodOverloading2 m2=new MethodOverloading2();
		m2.Displaydetails();
		m2.Displaydetails(500);
		m2.Displaydetails(100,200);
		m2.Displaydetails(200,400,600);

	}

}
