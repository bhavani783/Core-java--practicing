package day19;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		System.out.println("program is started");
		String s=null;//if we provide string value here,we didn't get exception ,so all catch blocks will ignored
		 try {
			 System.out.println(s.length());
		 }catch(NullPointerException e) {
			 System.out.println("handled exception");
			 System.out.println(e.getMessage());//we no need to write any  message because get message is a pre defined method
			 
		 }
		 catch(ArithmeticException e) {
			 System.out.println("handeled exception");
			 System.out.println(e.getMessage());
			 
		 }
		 System.out.println("program is complted");
		 System.out.println("program is finished");
		
		
	}

}
