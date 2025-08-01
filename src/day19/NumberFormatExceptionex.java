package day19;

public class NumberFormatExceptionex {

	public static void main(String[] args) {
		System.out.println("Program is started");
		String s="12345";//here instead of numbers ,we provide any string values we will get Number format exception
		int num=Integer.parseInt(s);//Integer is a Wrapper class here,and it will provide int type 
		System.out.println(num);
		System.out.println("program is completed");
		System.out.println("program is exited");


	}

}
