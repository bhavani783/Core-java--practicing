package day11;
//class1(abstract class)
abstract class A{
	String departement="Testing";
	public abstract void operation();
	public abstract void f1();
	public abstract void f2();
	public void showdepartementdetails() {
		System.out.println("departement is:"+departement+"\n");
	}
}
//class 2(abstract class)
abstract class B extends A{
	String company="Techno solutions";
	public void operation() {
		System.out.println("impemented operation method"+"\n");
		
	}
	public abstract void f3();
	public void showcompanydetails() {
		System.out.println("company name is:"+company+"\n");
	}
}
//class 3(abstract class)
abstract class C extends B{
	String location="hyderabad";
	public void f3() {
		System.out.println("implemented f3 method"+"\n");
	}
	public void showlocationdetails() {
		System.out.println("location is:"+location+"\n");
	}
}
//class 4(concrete class)
class D extends C{
	String empname;
	int empid;
	public D(String name,int id) {
		this.empname=name;
		this.empid=id;
	}
	public void f1() {
		System.out.println("implemented f1 method");
	}
	public void f2() {
		System.out.println("implemented f2 method");
	}
	public void displayempdetails() {
		System.out.println("employee name is:"+empname+"\n");
		System.out.println("employee id is:"+empid+"\n");
	}
}
public class Abstractex1 {
	
	public static void main(String[] args) {
		
		D dobj=new D("Raghava",1234);
		dobj.f1();
		dobj.f2();
		dobj.f3();
		dobj.operation();
		dobj.displayempdetails();
		dobj.showcompanydetails();
		dobj.showdepartementdetails();
		dobj.showlocationdetails();
		
	}

}
