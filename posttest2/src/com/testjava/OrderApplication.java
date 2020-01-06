package com.testjava;

//import java.util.Map; //MAP
import java.util.TreeMap;

//import com.testjava.CustomerOrderException;

public class OrderApplication {
	static TreeMap<Integer, Customer> customerMap = new TreeMap<Integer, Customer>(); // Map for generic
	private static Customer customer1;

	public static void main(String[] args) {

		try {
			Customer customer1 = new Customer(1, "Parvathy");
			addCustomer(customer1);
			findCustomer(1);
			Customer updatedCustomer = new Customer(1, "Mohan");
			updateCustomer(updatedCustomer);
			deleteCustomer(1);
		} catch (CustomerOrderException customerorderexception) {
			System.out.println("Customer Order Exception!");
		}
	}

	// Add Customer
	private static void addCustomer(Customer customer) {
		try {
			customerMap.put(Customer.customerId, customer);
			System.out.println("Customer added successfully!");
		} catch (CustomerOrderException customerorderexception) {
			System.out.println("Sorry! Customer could not be added.");
		}
	}

	// Find Customer
	private static void findCustomer(int customerId) {
		Customer customer1 = (Customer) customerMap.get(customerId);
		if (customer1 != null)
			System.out.println("Customer found: " + customer1);

		else {
			System.out.println("Sorry! Customer not found.");
		}
	}

	// Update Customer
	private static void updateCustomer(Customer updatedCustomer) {
		Customer customer1 = (Customer) customerMap.get(Customer.customerId);
		if (customer1 != null) {
			customerMap.put(Customer.customerId, customer1);
			System.out.println("Updated customer: " + customer1);
		} else {
			System.out.println("Sorry! Could not update customer!");
		}
	}

	// Delete Customer
	private static void deleteCustomer(int customerId1) {
		customer1 = (Customer) customerMap.get(customerId1);
		Customer customer12 = customer1;
		if (customer12 != null) {
			System.out.println("Customer details deleted!");
		} else {
			System.out.println("Sorry! Could not delete customer details");
		}
	}

	}


