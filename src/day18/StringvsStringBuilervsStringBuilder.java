package day18;

public class StringvsStringBuilervsStringBuilder {

	public static void main(String[] args) {
		//String is immutable(change is not possible)
		String s="welcome";
		s.concat("to java");
		System.out.println(s);//welcome 
		
		//String buffer(mutable-change is possible)
		StringBuffer s1=new StringBuffer("welcome");
		s1.append(" to java");
		System.out.println(s1);
		
		//String Builder(mutable)
		StringBuilder s2=new StringBuilder("java");
		s2.append(" automation");
		System.out.println(s2);
		
		
	}

}
