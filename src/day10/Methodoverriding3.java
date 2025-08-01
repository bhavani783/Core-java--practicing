package day10;

import java.util.Scanner;

//base class
class Bank{
	double balance;
	
		//method(to check balance)
	public void checkbalance(double balance) {
		System.out.println(" Balance is: "+balance);
	}
}
//derived class 1
class SBI extends Bank{
	//default constructor
	SBI(){
		String accountnumber="123456789";
		String bankname="SBI";
		System.out.println("Account number is:"+accountnumber);
		System.out.println("Bank name is:"+bankname);
		
	}
	//over raided method
	public void checkbalance(double balance) {
		System.out.println(" Available Balance in SBI bank is:"+balance);
	}
	
}
//derived class 2
class ICICI extends Bank{
	//default constructor
	ICICI(){
		String accountnumber="987654321";
		String bankname="ICICI";
		System.out.println("Account number is:"+accountnumber);
		System.out.println("Bank name is:"+bankname);
		
	}
	//over raided method
	public void checkbalance( double balance) {
		System.out.println("Available Balance in ICICI bank is:"+balance);
	}
}
//derived class 3
class SBH extends Bank{
	//default constructor
	SBH(){
	String accountnumber="246897531";
	String bankname="SBH";
	System.out.println("Account number is:"+accountnumber);
	System.out.println("Bank name is:"+bankname);
}
	public void checkbalance( double balance) {
		System.out.println("Available Balance in SBH bank is:"+balance);
	}
}
public class Methodoverriding3 {
public static void main(String[] args) {
	Bank mybank;
	Scanner sc=new Scanner(System.in);
	System.out.println(sc);
	System.out.println("please enter your bank name to know the balance");
	System.out.println("If you are a SBI customer please enter SBI");
	System.out.println("If you are a ICICI customer please enter ICICI");
	System.out.println("If you are a SBH customer please enter SBH");
	
	String name=sc.nextLine();
	if(name.equalsIgnoreCase("SBI")) {
		mybank=new SBI();	
		mybank.checkbalance(10000);
		
	}
	else if(name.equalsIgnoreCase("ICICI")) {
		mybank=new ICICI();
		mybank.checkbalance(20500);
		
	}
	else if(name.equalsIgnoreCase("SBH")) {
		mybank=new SBH();
		mybank.checkbalance(15000);
	}
	else {
		System.out.println("please provide valid bank name to check your balance");
	}

	}

}
