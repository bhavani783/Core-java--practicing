package day13;

public class TestMain {
	public static void main(String[] args) {
	TestEncapsulationwithoutMain t=new TestEncapsulationwithoutMain();
	//setting values to data members
	t.setName("Bhavani");
	t.setAge(23);
	t.setCity("Madanapalli");
	//Retrieving data from data members
	System.out.println("Name is:"+(t.getName()));
	System.out.println("Age is:"+(t.getAge()));
	System.out.println("City is:"+(t.getCity()));
	}

}
