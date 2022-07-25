package com.example1;

public class Customer {
	private int customerId;
	private String customerName;
	private Long customerContact;
	private String customerAddress;

	public Customer(int customerId, String customerName, Long customerContact, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(Long customerContact) {
		this.customerContact = customerContact;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void getDetails() {
		System.out.println("Name: " + getCustomerName() + " ID: " + getCustomerId() + " Contact: "
				+ getCustomerContact() + " Address: " + getCustomerAddress());
	}

}
