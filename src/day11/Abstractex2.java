package day11;
//base class
abstract class basetest{
	public void print() {
		System.out.println("i am print method from base test");
	}
	public abstract void sum();
}
//derived class1
class Intsum extends basetest{
	
	 public void info() {
		System.out.println("i am info method from derived class1");
	}
	public void sum() {
		int x=100+200;
		System.out.println("\n integer sum is:"+x);
	}
}
//derived class2
class Floatsum extends basetest{
	public void display() {
		System.out.println("i am display method from derived class 2");
	}
	public void sum() {
		float f=111.23f+234.5f;
		System.out.println("\n float sum is:"+f);
	}
}
//derived class3
class longsum extends basetest{
	public void check() {
		System.out.println("i am check method from derived class 3");
	}
	public void sum() {
		long l=1234556+569007656;
		System.out.println("\n long sum is:"+l);
	}
}
//derived class4
class Stringsum extends basetest{
	public void show() {
		System.out.println("i am show method from derived class4");
	}
	public void sum() {
		String s1="welcome to";
		String s2="java selenium";
		System.out.println("\n String sum is:"+(s1 + s2));
		System.out.println("String sum represents String concatination");
	}
}

public class Abstractex2 {
	public static void main(String[] args) {
	/*	//indirect object creation (dynamic binding)
		basetest b=new Intsum();
		b.print();
		b.sum();
		//b.info();
		
		basetest b1=new Floatsum();
		b1.print();
		b1.sum();
		//b1.display();
		basetest b2=new longsum();
		b2.print();
		b2.sum();
		//b2.check();
		basetest b3=new Stringsum();
		b3.print();
		b3.sum();
		//b3.show();*/
		
		//direct object creation
		Intsum s=new Intsum();
		s.print();
		s.sum();
		s.info();
		Floatsum s1=new Floatsum();
		s1.print();
		s1.sum();
		s1.display();
		longsum s2=new longsum();
		s2.print();
		s2.sum();
		s2.check();
		 Stringsum  s3=new  Stringsum();
		 s3.print();
		 s3.sum();
		 s3.show();
	}
	
}


