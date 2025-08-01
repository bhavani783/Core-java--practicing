package day4;

public class This1 {
	//data members
	String name;
	int age;
	int total_marks;
	//parameterized constructor
	public This1(String name,int age,int total_marks) {
		this.name=name;
		this.age=age;
		this.total_marks=total_marks;
		System.out.println("name is:"+name);
		System.out.println("age:"+age);
		System.out.println("total marks is:"+total_marks);
	
	}

	public static void main(String[] args) {
		This1 t=new This1("java user",24,340);
		This1 t1=new This1("c++ user",30,450);
		System.out.println(t.name);
		System.out.println(t.age);
		System.out.println(t.total_marks);
		System.out.println(t1.name);
		System.out.println(t1.age);
		System.out.println(t1.total_marks);


	}

}
