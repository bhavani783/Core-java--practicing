package day7;

public class Student extends Institute {
	
	 //data members
	String StudentName="java user";
	String StudentAdderess="MPL";
	String StudentNumber="12345";
	
	//method
	public void displayStudentInfo() {
		System.out.println("I am from student class method");
		System.out.println("Student name is:"+StudentName);
		System.out.println("Student adderess is:"+StudentAdderess);
		System.out.println("Student number is:"+StudentNumber);
	}


	public static void main(String[] args) {
		Student stu=new Student();
		System.out.println("i am from student class data members");
		System.out.println("Student name is:"+stu.StudentName);
		System.out.println("Student adderess is:"+stu.StudentAdderess);
		System.out.println("Student number is:"+stu.StudentNumber);
		
		System.out.println("i am from institute class data members ");
		System.out.println("Institute name is:"+stu.InstituteName);
		System.out.println("Institute adderess is:"+stu.InstituteAdderess);
		stu.displayInstituteInfo();
		stu.displayStudentInfo();
	}
}
