package ch04;

class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int id, String name) {
		this.customerID = id;
		this.customerName = name;
		
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
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ��� " + bonusPoint + "�Դϴ�.";
	}
}


class VIPCustomer extends Customer{
	
	private int agentID;
	double salesRatio;
	
	public VIPCustomer(int id, String name) {
		super(id, name);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	@Override
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ��� " + bonusPoint + "�Դϴ�.";
	}
}

public class CustomerTest {
	public static void main(String[] args) {
		
	Customer customerLee = new Customer(10010, "�̼���");
	customerLee.bonusPoint = 1000;
	System.out.println(customerLee.showCustomerInfo());
	
	Customer customerKim = new Customer(10020, "������");
	customerKim.bonusPoint = 10000;
	System.out.println(customerKim.showCustomerInfo());
	
	int priceLee = customerLee.calcPrice(10000);
	int priceKim = customerKim.calcPrice(10000);
	
	System.out.println(customerLee.showCustomerInfo() + " ���ұݾ��� " + priceLee + "�� �Դϴ�.");
	System.out.println(customerKim.showCustomerInfo() + " ���ұݾ��� " + priceKim + "�� �Դϴ�.");

	Customer customerNo = new VIPCustomer(10030, "������");
	customerNo.bonusPoint = 10000;
	int priceNo = customerNo.calcPrice(10000);
	System.out.println(customerNo.showCustomerInfo() + " ���ұݾ��� " + priceNo  + "�� �Դϴ�.");
	}
}
