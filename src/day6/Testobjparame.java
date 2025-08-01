package day6;
//object as parameterized constructor
public class Testobjparame {
String name;
int age;
int id;
//parameterized constructor
  public Testobjparame(String studentname,int studentage,int studentid) {
	 name=studentname;
	 age=studentage;
	 id=studentid;
	 System.out.println("I am from parameterized constructor");
	
	
}
  //copy constructor or object as parameterized constructor
 public Testobjparame(Testobjparame tobj) {
	 System.out.println(" i am from copy constructor");
	 name=tobj.name;
	 age=tobj.age;
	 id=tobj.id;
 }
 void display() {
	 System.out.println("student name is:"+name);
	 System.out.println("student age is:"+age);
	 System.out.println("student id is:"+id);
 }
	public static void main(String[] args) {
		Testobjparame testobj=new Testobjparame("bhavani",23,2345);
		testobj.display();
		Testobjparame testobj1=new Testobjparame(testobj);
		testobj1.display();
		//checking copying or not
		System.out.println(testobj1.name);
		System.out.println(testobj1.age);
		System.out.println(testobj1.id);
		Testobjparame testobj2=new Testobjparame(testobj1);
		testobj2.display();

	}

}
