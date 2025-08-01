package day19;

public class Singlecatchblock {

	public static void main(String[] args) {
		System.out.println("program is started");
		String value=null;
		try {
			System.out.println(value.length());
		}
		catch(Exception e) {
			System.out.println("handled exception");
			System.out.println(e.getMessage());
		}
		System.out.println("program completed");
		System.out.println("program exited");

	}

}
