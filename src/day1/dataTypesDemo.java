package day1;

public class dataTypesDemo {

	public static void main(String[] args) {
       //Numeric data types
		//int(size=4 bytes)
		int a=100;
		int b=200;
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		System.out.println(a+b);
		System.out.println("the sum of a and b is:"+(a+b));
		//byte(size=1 byte)
		byte by=125;
		System.out.println(by);
		//short(2 bytes)
		short sh=3535;
		System.out.println(sh);
		//long(8 bytes)
		long l=212324224L;//L is literal
		System.out.println(l);
		//Decimal numbers
		//float(4 bytes)
		float item_price=15.5F;//F is literal
		System.out.println(item_price);
		//double(8 bytes)
		double dbl=1234.45678;
		System.out.println(dbl);
		//char(2 bytes)
		char grade='A';
		System.out.println(grade);
		//String (each character occupies 2 bytes of memory)
		String name="John";
		System.out.println(name);
		//boolean(1 bit)
		boolean bl=true;
		System.out.println(bl);
		
		

	}

}
