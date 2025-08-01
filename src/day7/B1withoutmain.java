package day7;
/*SINGLE INHERITENCE:
 * --->there exist one base class and one derived class
 */
public class B1withoutmain {
//data members
	String studentname="david";
	int studentage=20;
	int studentrollnum=12345;
	//method
	public void displaystudentdetails() {
		System.out.println("i am from Base class");
		System.out.println("student name is:"+" "+studentname);
		System.out.println("student age is:"+" "+studentage);
		System.out.println("student roll number is:"+" "+studentrollnum);
	}
}
