package day13;

public class AccountWithMain {

	public static void main(String[] args) {
		AccountWithoutMain ac=new AccountWithoutMain();
		//set the data
		ac.setName("Sekhar");
		ac.setAccuountnum(987654321);
		ac.setAmount(50000);
		//get the data/Read the data
		System.out.println("Name is:"+(ac.getName()));
		System.out.println("Account number is:"+(ac.getAccuountnum()));
		System.out.println("Amount is:"+(ac.getAmount()));

	}

}
