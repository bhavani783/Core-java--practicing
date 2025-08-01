package day12;
abstract class Classc1{
	public abstract void a2() ;
//classc1 own concrete method
	public void display() {
		System.out.println("\nI am display method from classc1");
	}	
}
public class Classc2 extends Classc1 implements InterfaceEx{
	public void a() {
		System.out.println("I am a implemented method");
	}
	public void a1() {
		System.out.println("I am a1 implemented method");
	}
	public void a2() {
		System.out.println("I am a2 implemented method");
	}
	//class own method
	public void printinfo() {
		String name="Raghava";
		String collage="SVU";
		System.out.println("\nI am from printinfo method");
		System.out.println("Name is:"+name+"Collage is :"+collage);
	}

	public static void main(String[] args) {
		//direct object creation
		Classc2 c2=new Classc2();
		c2.a();
		c2.a1();
		c2.a2();
		c2.display();
		c2.printinfo();
		
		

	}

}
