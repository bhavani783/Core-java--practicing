package day7;
/*Inheritance:
 * --->It is one of the distinct feature in object oriented programming.
 * --->The process of obtaining the data members and methods from one class to
 * another class is called inheritance. 
 * Advantages:
 * 1)application development takes less time
 * 2)less memory space
 * 3)less execution time
 * 4)performance will be increased
 * 5)avoid duplication
 * 6)code re usability
 * 7)we achieve java slogan:write once re use anywhere. 
 */
public class Institute {
//data members
	String InstituteName="Dhruva";
	String InstituteAdderess="MPL";
	//instant method
	
	public void displayInstituteInfo() {
		System.out.println("i am from institute class method");
		System.out.println("Institute name is:"+InstituteName);
		System.out.println("Institute address is"+InstituteAdderess);
	}
}
