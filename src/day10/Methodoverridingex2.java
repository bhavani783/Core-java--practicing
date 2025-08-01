package day10;

import java.util.Scanner;

//base class
class car{
	//data members
	String brandname;
	String fueltype;
	int seatingcapacity;
	//method1
	public void displaycommonfeatures() {
		System.out.println("Brand name is:"+brandname);
		System.out.println("Fuel type is:"+fueltype);
		System.out.println("Seating capacity is:"+seatingcapacity);
	}
	//method2
	public void price() {
		System.out.println("price details are not available");
	}
		
	
}
//derived class1 
class BMW extends car{
	BMW(){
		brandname="BMW";
		fueltype="Petrol";
		seatingcapacity=5;
	}
	public void price() {
		System.out.println("BMW price starts from 50,00,000");
	}
}
//derived class2
class TOYOTO extends car{
	TOYOTO(){
		brandname="TOYOTO";
		fueltype="Diesel";
		seatingcapacity=7;
	}
	public void price() {
		System.out.println("TOYOTO price starts from 10,00,000");
	}
}
//derived class3
class TESLA extends car{
	TESLA(){
		brandname="TESLA";
		fueltype="Electric";
		seatingcapacity=5;
	} 
	public void price() {
		System.out.println("TESLA price starts from 30,00,000");
	}
}

public class Methodoverridingex2 {

	public static void main(String[] args) {
		car mycar;
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("----------please select car type---------");
		System.out.println("for BMW pls enter BMW");
		System.out.println("for TOYOTO pls enter TOYOTO");
		System.out.println("for TESLA pls enter TESLA");
		
		String brand=sc.nextLine();
		if(brand.equalsIgnoreCase("BMW")) {
			mycar=new BMW();
			mycar.price();
			mycar.displaycommonfeatures();
			
		}
		else if(brand.equalsIgnoreCase("TOYOTO")) {
			mycar=new TOYOTO();
			mycar.price();
			mycar.displaycommonfeatures();
		}
		else if(brand.equalsIgnoreCase("TESLA")) {
			mycar=new TESLA();
			mycar.price();
			mycar.displaycommonfeatures();
		}
		else {
			System.out.println("invalid input ");
			System.out.println("please select/enter valid input ");
		}

	}

}
