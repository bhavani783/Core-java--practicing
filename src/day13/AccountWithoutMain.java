package day13;

public class AccountWithoutMain {
//it's mandatory to put "private"keyword in front of every data member
	private int accuountnum;
	private String name;
	private double amount;
	//getters and setters(go to source and select generate getters and setters)
	public int getAccuountnum() {
		return accuountnum;
	}
	public void setAccuountnum(int accuountnum) {
		this.accuountnum = accuountnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
