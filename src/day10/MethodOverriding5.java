package day10;

import java.util.Scanner;

//parent class
class Bike{
	//data members
	String Brandname;
	int Maxspeed;
	String enginetype;
	// default constructor
	Bike(){
		Brandname="Generic bike";
		Maxspeed=60;
		enginetype="petrol";
	}
	//method
public void ride() {
		System.out.println("Riding"+Brandname);
		System.out.println("Maximum speed:"+Maxspeed+"Km/h");
		System.out.println("Engine type:"+enginetype);
	}
	
}
//child class1
class Bullet extends Bike{
	Bullet(){
		Brandname="Royal enfield";
		Maxspeed=110;
		enginetype="petrol";
	}
	public void ride() {
		System.out.println("bullet price start's from 2000000");
		System.out.println("Riding bullet"+Brandname);
		System.out.println("Maximum speed:"+Maxspeed+"Km/h");
		System.out.println("Engine type:"+enginetype);
		
	}
}
class Yamaha extends Bike{
	Yamaha(){
		Brandname="Yamaha";
		Maxspeed=130;
		enginetype="petrol";
	}
	public void ride() {
		System.out.println("Yamaha price start's from 1000000");
		System.out.println("Riding Yamaha bike"+Brandname);
		System.out.println("Maximum speed:"+Maxspeed+"Km/h");
		System.out.println("Engine type:"+enginetype);
	}
}

public class MethodOverriding5 {
	public static void main(String[] args) {
		Bike bike;
		//bike=new Bullet();
		//bike.ride();
		
		//bike=new Yamaha();
		//bike.ride();
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("enter your choice");
		System.out.println("for bullet enter bullet");
		System.out.println("for yamaha enter yamaha");
		String brand=sc.nextLine();
		if(brand.equalsIgnoreCase("bullet")) {
			bike=new Bullet();
			bike.ride();
		}
		if(brand.equalsIgnoreCase("yamaha")) {
			bike=new Yamaha();
			bike.ride();
		}
		else {
			System.out.println("please enter valid brand name");
		}
				
	}

}
