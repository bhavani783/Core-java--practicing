package day7;

public class D1withmain extends B1withoutmain {
//it is always recommended to create object for child class.
	//data members
	String studentcollagename="gnanambica";
	String studentuniversity="SVU";
	//method
	public void printstudentdetails() {
		System.out.println("i am from derived class");
		System.out.println("student collage name is:"+" "+studentcollagename);
		System.out.println("student university name is:"+" "+studentuniversity);
	}
	public static void main(String[] args) {
		D1withmain d=new D1withmain();
		System.out.println(d.studentname);
		System.out.println(d.studentage);
		System.out.println(d.studentrollnum);
		System.out.println(d.studentcollagename);
		System.out.println(d.studentuniversity);
		d.displaystudentdetails();
		d.printstudentdetails();

	}

}
