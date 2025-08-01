package day6;
//parameterized constructor 

public class Student {
//data members
	String name;
	String collage;
	int age;
	//parameterized constructor
	Student(String studentname,String studentcollagename,int studentage){
		name=studentname;
		collage=studentcollagename;
		age=studentage;
		
		System.out.println("Student name is :"+" "+name);
		System.out.println("Student collage name is:"+" "+collage);
		System.out.println("Student age is:"+" "+age);
	}
	
	public static void main(String[] args) {
		System.out.println("------printing student1 details------");
		Student s1=new Student("Bhavani","Gnanambica",23);
		System.out.println("-------printing student2 details------");
		Student s2=new Student("pallavi","MITS",24);
		System.out.println("-------printing student3 details------");
		Student s3=new Student("sasikala","gnanambica",25);
		System.out.println(s1.name);
		System.out.println(s1.collage);
		System.out.println(s1.age);
		System.out.println(s2.name);
		System.out.println(s2.collage);
		System.out.println(s2.age);
		System.out.println(s3.name);
		System.out.println(s3.collage);
		System.out.println(s3.age);

		
				

	}

}
