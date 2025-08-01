package day7;
/*Hierarchical inheritance:
 * -->there exist 1 base class and multiple derived classes
 */
class BC{
	//data members
	String Institutename="Dhruva softech";
	String address="MPL";
	String contact="12345678";
	//method
	public void displaydetails() {
		System.out.println("i am from base class");
		System.out.println("Institute name is:"+" "+Institutename);
		System.out.println("Institute address is:"+" "+address);
		System.out.println("Institute contact info is:"+" "+contact);
	}
	
}
class DC1 extends BC{
	//data members
	String coursename1="Automation engineer";
	String skill1="java";
	String skill2="selenium,Rest assured";
	//method
	public void displaycourse1info() {
		System.out.println(" i am from derived class 1");
		System.out.println("course name is:"+" "+coursename1);
		System.out.println("skills required is:"+" "+(skill1 + skill2));
	}
}
class DC2 extends BC{
	//data members
		String coursename2="Java mastery";
		String skill3="java core concepts";
		String skill4="SQL,Reactjs,Springboot";
		//method
		public void displaycourse2info() {
			System.out.println(" i am from derived class 2");
			System.out.println("course name is:"+" "+coursename2);
			System.out.println("skills required is:"+" "+(skill3 + skill4));
}
}
class DC3 extends BC{
	//data members
			String coursename3="Python mastery with cloud intigration";
			String skill5="python";
			String skill6="SQL,Reactjs,Flask,Django";
			//method
			public void displaycourse3info() {
				System.out.println(" i am from derived class 3");
				System.out.println("course name is:"+" "+coursename3);
				System.out.println("skills required is:"+" "+(skill5 + skill6));
	}
	
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		DC2 dc2obj=new DC2();
		System.out.println("------Derived class 2-------");
		System.out.println(dc2obj.Institutename);
		System.out.println(dc2obj.address);
		System.out.println(dc2obj.contact);
		System.out.println(dc2obj.coursename2);
		System.out.println(dc2obj.skill3);
		System.out.println(dc2obj.skill4);
		dc2obj.displaydetails();
		dc2obj.displaycourse2info();
		DC1 dc1obj=new DC1();
		System.out.println("------derived class 1-------");
		System.out.println(dc1obj.Institutename);
		System.out.println(dc1obj.address);
		System.out.println(dc1obj.contact);
		System.out.println(dc1obj.coursename1);
		System.out.println(dc1obj.skill1);
		System.out.println(dc1obj.skill2);
		dc1obj.displaydetails();
		dc1obj.displaycourse1info();
		DC3 dc3obj=new DC3();
		System.out.println("-------derived class 3-----");
		System.out.println(dc3obj.Institutename);
		System.out.println(dc3obj.address);
		System.out.println(dc3obj.contact);
		System.out.println(dc3obj.skill5);
		System.out.println(dc3obj.skill6);
		System.out.println(dc3obj.coursename3);
		dc3obj.displaydetails();
		dc3obj.displaycourse3info();
		
		

		

	}

}
