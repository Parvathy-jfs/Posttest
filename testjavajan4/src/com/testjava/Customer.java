package com.testjava;

public class Customer {
	static int customerId;
	static String customerName;
	public Customer(int customerId, String customerName) {
		super();
	    Customer.customerId= customerId;
		Customer.customerName= customerName; 		
	}
	public void sendOrder() {
		System.out.println("Customer order sent!");
		
	}
	public void receieveOrder() {
		System.out.println("Customer order received!");
	}
	@Override
	public String toString() {
		return "Customer details: [Customer ID: "+customerId+", CustomerName: "+ customerName+"]";
	}

}
