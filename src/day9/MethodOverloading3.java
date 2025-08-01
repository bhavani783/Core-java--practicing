package day9;
//ORDER OF PARAMETERS
public class MethodOverloading3 {
	
		public void show() {
			System.out.println("I am overloading method ,but i don't have any arguments/paremeters");
		}
		public void show(int a,float f,boolean b,String name) {
			System.out.println("\nI am from overloading for checking the order of paremeters/arguments ");
			System.out.println(a+" "+f+" "+b+" "+name);
		}
		public void show(float f,int a,String name,boolean b) {
			System.out.println("\nI am from overloading for checkimg the order of parameters/arguments");
			System.out.println(f+" "+a+" "+name+" "+b);
		}
		static public void main(String[] args) {
			MethodOverloading3 m3=new MethodOverloading3();
			m3.show();
			m3.show(10, 2345, true, "Chandu");
			m3.show(123, 300, "sasi", true);
			
		}
	}


