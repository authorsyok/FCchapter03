package ch03;

class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스는 " + bonusPoint + "입니다.";
	}
}


class VIPCustomer extends Customer{
	
	private int agentID;
	double salesRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
}

public class CustomerTest {
	public static void main(String[] args) {
		
	Customer customerLee = new Customer();
	customerLee.setCustomerID(10010);
	customerLee.setCustomerName("이순신");
	customerLee.bonusPoint = 1000;
	System.out.println(customerLee.showCustomerInfo());
	
	Customer customerKim = new Customer();
	customerKim.setCustomerID(10020);
	customerKim.setCustomerName("김유신");
	customerKim.bonusPoint = 10000;
	System.out.println(customerKim.showCustomerInfo());
	}
}
