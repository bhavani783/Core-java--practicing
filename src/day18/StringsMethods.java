package day18;

public class StringsMethods {
//String is an object that represents sequence of characters,these all are available in java.lang package.
	public static void main(String[] args) {
		//create string variable
		//approach 1
		
		String s="Welcome";
		
		//approach2
		
		//String s=new String("Welcome");
		//1)length()-returns length of a String(no.of characters in string)
		int l=s.length();
		System.out.println("length of string is "+ l);//s.length()
		 
		//2)concat()-join 2 or multiple strings
		String s1="welcome";
		String s2="to java";
		String s3=" automation";
		//System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));//s1.concat(s2+s3)
		
		//3)trim()-remove spaces right and left
		String s4="     welcome     ";
		System.out.println(s4.length());//17	
		System.out.println(s4);//display along with spaces
		System.out.println(s4.trim());//welcome
		
		//4)charAt()-returns a character from a string based on index
		System.out.println(s.charAt(3));//c
		System.out.println(s.charAt(0));//w
		
		//5)contains-always returns true/false
		String s5="Java user";
		System.out.println(s5.contains("java"));
		System.out.println(s5.contains("Java"));
		System.out.println(s5.contains("user"));
		System.out.println(s5.contains("JAV"));
		
		//6)equals() and equalsIgnorecase()-comparing the Strings(returns true/false)
		System.out.println(s==s1);//false
		System.out.println(s.equals(s1));//false
		System.out.println(s.equalsIgnoreCase(s1));//true
		
		//7)replace()-replace single/sequence of characters
		String s6="welcome to java and selenium with java";
		System.out.println(s6.replace('e', 'a'));
		String s7="welcome to selenium web driver";
		System.out.println(s7.replaceFirst("selenium", "java"));
		
		//8)substring()-extract substring from main string
		
		System.out.println(s.substring(1,5));
		System.out.println(s.substring(4,6));
		
		//9)to Uppercase() and to Lowercase()
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//10)split()-split the string into multiple parts based on delimiter /space.
		String s8="abc@gmail.com";
		String a[]=s8.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
	}

}
