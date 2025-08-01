package day9;
/*Polymorphism:
 * -->the process of representing 1 form into multiple forms.
 * -->in java ,we can achieve polymorphism in 2 ways
 * 1)Method overloading
 * 2)Method overriding
 * 
 * 1)Method overloading:
 * ---->If a class having more than 1 method having same name and with different
 * signature.
 * -->signature represents
 * *type of parameters
 * *order of parameters
 * *no.of parameters
 * 
 */
//1)example for Type of parameters
public class Methodoverloading1 {
	public void sum() {
		System.out.println("I am from sum method without any parameters");
	}
	public void sum(int a,int b) {
		System.out.println("I am from sum method with having int parameters");
		int c=a+b;
		System.out.println("integer sum is:"+c);
	}
	public void sum(float f1,float f2) {
		System.out.println("I am from sum method with having float parameters");
		float f3=f1+f2;
		System.out.println("float sum is:"+f3);
	}
	public void sum(char c1,char c2) {
		System.out.println("I am from sum method with havig char parameters");
		int c3=c1+c2;
		System.out.println(" char sum is:"+c3);
	}
	public void sum(String fname,String lname) {
		System.out.println("I am from sum method with having String parameters");
		String fullname=fname+lname;
		System.out.println("String sum is:"+fullname);
	}

	public static void main(String[] args) {
		Methodoverloading1 mo=new Methodoverloading1();
		mo.sum();
		mo.sum(20,30);
		mo.sum(12.5f,56.7f);
		mo.sum('a', 'b');
		mo.sum("java", "user");
	}

}
