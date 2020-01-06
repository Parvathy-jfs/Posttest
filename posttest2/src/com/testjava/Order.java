package com.testjava;

public abstract class Order{
	int orderId;
	String orderItem;
	int quantity;
	public abstract void confirm();
	public abstract void close();	
}

class SpecialOrder extends Order{
	
	public void confirm() {
		System.out.println("Special order confirmed!");
	}
	public void received() {
		System.out.println("Special order received!");
	}
	public void dispatch() {
		System.out.println("Special order dispatched");
	}
	public void close() {
		System.out.println("Special order closed!");
	}
}

class NormalOrder extends Order{
	public void confirm() {
		System.out.println("Normal order confirmed!");
	}
	public void received() {
		System.out.println("Normal order received!");
	}
	public void dispatch() {
		System.out.println("Normal order dispatched");
	}
	public void close() {
		System.out.println("Normal order closed!");
	}
}

