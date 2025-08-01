package day10;
import java.util.Scanner;
//parent class
class ATM{
	//data members
	double balance=1000;
	String bankname="generic bank";
	//method for checking balance
	public void checkbalance() {
		System.out.println("Balance is:"+" "+balance);
	}
	//method for deposit
	public void deposite(double amount) {
		balance=balance+amount;
		System.out.println("-----deposited-----");
		System.out.println("amount deposited"+amount);
		checkbalance();
	}
	//method for withdraw
	public void withdraw(double amount) {
		if(amount<=balance) {
		balance=balance-amount;
		System.out.println("------withdraw-----");
		System.out.println("amount withdraw"+amount);
		}
		else {
			System.out.println("insuffient amount");
		}
		checkbalance();
		}
}
//derived class1
class SBI1 extends ATM{
	int pinnum=1234;
	SBI1(){
		bankname="SBI";
	}
	public void deposite(double amount) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("enter pin number for"+bankname+":");
		int enteredpin=sc.nextInt();
		if(enteredpin==pinnum) {
		System.out.println("welcome to"+" "+bankname);
		super.deposite(amount);
		}
		else {
			System.out.println("invalid pin number,please enter correct pin number");
		}
		
	}

	public void withdraw(double amount) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("\n");
		System.out.println("enter pin number for"+bankname+":");
		int enteredpin=sc.nextInt();
		if(enteredpin==pinnum) {
		//System.out.println("\n");//to print in next line
		System.out.println("welcome to"+" "+bankname);
		super.withdraw(amount);
	}else {
		System.out.println("invalid pin number,please enter valid pin number");
	}
}
}

//derived class2
class ICICI1 extends ATM{
	int pinnum=5678;
	ICICI1(){
		bankname="ICICI";
	}
	public void deposite(double amount) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("enter pin number for"+bankname+":");
		int enteredpin=sc.nextInt();
		if(enteredpin==pinnum) {
		System.out.println("welcome to"+" "+bankname);
		super.deposite(amount);
	}else {
		System.out.println("invalid pin number ,please enter correct pin number");
	}
	}
	public void withdraw(double amount) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("\n");
		System.out.println("enter pin number for"+bankname+":");
		int enteredpin=sc.nextInt();
		if(enteredpin==pinnum) {
		System.out.println("welcome to"+" "+bankname);
		super.withdraw(amount);
	}else {
		System.out.println("invalid pin number,please enter correct pin number");
	}
	}
}
//derived class3
class HDFC1 extends ATM{
	int pinnum=2468;
	HDFC1(){
		bankname="SBI";
	}
	public void deposite(double amount) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("enter pin number for"+bankname+":");
		int enteredpin=sc.nextInt();
		if(enteredpin==pinnum) {
		System.out.println("welcome to"+" "+bankname);
		super.deposite(amount);
	}else {
		System.out.println("invalid pin number ,please enter correct pin number");
	}
	}
	
	public void withdraw(double amount) {
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
		System.out.println("enter pin number for"+bankname+":");
		int enteredpin=sc.nextInt();
		if(enteredpin==pinnum) {
		System.out.println("\n");//to print in next line
		System.out.println("welcome to"+" "+bankname);
		super.withdraw(amount);
	}else {
		System.out.println("invalid pin number ,please enter correct pin number");
	}
}
}


public class Methodoverriding4 {
	public static void main(String[] args) {
	ATM atm;
	Scanner s=new Scanner(System.in);
	System.out.println(s);
	System.out.println("------enter bank name to know the details------");
	String name=s.nextLine();
	
	if(name.equalsIgnoreCase("SBI")) {
	atm=new SBI1();
	atm.deposite(2000);
	atm.withdraw(2500);
	}
	else if(name.equalsIgnoreCase("ICICI")) {
		atm=new ICICI1();
		atm.deposite(10000);
		atm.withdraw(1000);
	}
	else if(name.equalsIgnoreCase("HDFC")) {
		atm=new HDFC1();
		atm.deposite(5000);
		atm.withdraw(10000);
	}
	else {
		System.out.println("enter valid bank name");
	}

	}

}
