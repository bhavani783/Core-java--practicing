package day6;
//3)order of parameters
public class Orderofparameters {
	//data members
	int a=10;
	float f=10.5f;
	boolean b=true;
	String name="user";
	
public Orderofparameters() {
	System.out.println("---default constructor---");
}
public Orderofparameters(int a,float f,boolean b,String name) {
	System.out.println(" i am from parameterized constructor1 and i am checking order");
	System.out.println(a+" "+f+" "+b+" "+name);
}
public Orderofparameters(float f,int a,String name,boolean b) {
	System.out.println(" i am from parameterized constructor2 and i am also checking order");
	System.out.println(f+" "+a+" "+name+" "+b);
}
	public static void main(String[] args) {
	System.out.println("----main method----");
	Orderofparameters op=new Orderofparameters();
	System.out.println(op.a);
	System.out.println(op.b);
	System.out.println(op.f);
	System.out.println(op.name);
	Orderofparameters op1=new Orderofparameters(20,20.5f,false,"java");
	System.out.println(op1.a);
	System.out.println(op1.b);
	System.out.println(op1.f);
	System.out.println(op1.name);
	Orderofparameters op2=new Orderofparameters(20f,30,"david",true);
	System.out.println(op2.a);
	System.out.println(op2.b);
	System.out.println(op2.f);
	System.out.println(op2.name);

	}

}
